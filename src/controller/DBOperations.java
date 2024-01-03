package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JFileChooser;

/**
 *
 * @author andre
 */
public abstract class DBOperations {

    //Atributos
    protected ResultSet resultSet = null;
    protected static Connection dbConnection = null;
    protected PreparedStatement prepStat = null;
    protected static final String path = System.getProperty("user.dir");
    private static String url;
    private static String username;
    private static String password;
    private static String driver;

    public static void init(File fileName)
            throws IOException, ClassNotFoundException {

        Properties props = new Properties();
        FileInputStream in = new FileInputStream(fileName);
        props.load(in);
        driver = props.getProperty("jdbc.driver");
        url = props.getProperty("jdbc.url");
        username = props.getProperty("jdbc.username");
        if (username == null) {
            username = "";
        }
        password = props.getProperty("jdbc.password");
        if (password == null) {
            password = "";
        }
        if (driver != null) {
            Class.forName(driver);
        }
    }

    //Cria conexao
    public boolean criaConexao() {
        boolean status = false;
        try{
            JFileChooser chooser = new JFileChooser(path);
            if (chooser.showDialog(null, "Salvar") == JFileChooser.APPROVE_OPTION) {
                if(chooser.getSelectedFile() != null){
                    DBOperations.init(chooser.getSelectedFile());             
                }
            }
                   
        }catch(IOException e){
            System.out.println("Exceção IO");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Classe não encontrada");
        }
        

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading MySQL JDBC driver: " + e.getMessage());
            System.out.println("Classe não encontrada");
        }

        try {
            DBOperations.dbConnection = DriverManager.getConnection(url, username, password);
            DBOperations.dbConnection.setAutoCommit(false);
            status = true;
        } catch (SQLException sqle) {
            System.out.println("Exceçao SQL");
        } finally {
            return status;
        }
    }

    //Fecha a conexão com o banco de dados
    public boolean fechaConexao() {
        if (this.dbConnection != null) {
            try {
                dbConnection.close();
                return true;
            } catch (SQLException erro) {
                System.out.println("Erro ao fechar a conexao" + erro);
                return false;
            }
        } else {
            return false;
        }
    }

    //Executa commit();
    public boolean commit() {

        boolean status = false;

        try {
            this.dbConnection.commit();
            status = true;
        } catch (SQLException e) {
            System.out.println("Não foi possivel executar o commit");
        } finally {
            return status;
        }
    }

    //Executa rollback
    public boolean rollback() {

        boolean status = false;

        try {
            this.dbConnection.rollback();
            status = true;
        } catch (SQLException e) {
            System.out.println("Não foi possivel executar o rollback");
        } finally {
            return status;
        }
    }

    //Checa se conexão existe
    public boolean checkConnection() {
        return DBOperations.dbConnection != null;
    }
}
