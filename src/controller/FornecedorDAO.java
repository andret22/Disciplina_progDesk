package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Fornecedor;

public class FornecedorDAO extends DBOperations{
    
    
    //Statments
    private static final String inserirST = "INSERT INTO FORNECEDOR VALUES(?, ?, ?);";
    private static final String alterarST = "UPDATE FORNECEDOR SET fornecedorID=?, nome=?, categoria=? WHERE fornecedorID=?";
    private static final String excluirST = "DELETE FROM FORNECEDOR WHERE fornecedorID=?";
    private static final String buscarST = "SELECT * FROM FORNECEDOR WHERE fornecedorID=?";
    
    //Flags
    private static boolean isSet = false;
    
    
    //Insere fornecedor no banco de dados
    public boolean inserir(Fornecedor fornecedor){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        boolean status = false;
        
        try{       
            this.prepStat = FornecedorDAO.dbConnection.prepareStatement(inserirST, tipo, concorrencia);         
            prepStat.setInt(1, fornecedor.getId());
            prepStat.setString(2, fornecedor.getNome());
            prepStat.setString(3, fornecedor.getCategoria());
            
            int resposta = prepStat.executeUpdate();
            
            System.out.println(resposta + " Linhas adicionadas");
            
            status = true;
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }finally{
            return status;
        }
    }
    
    //Altera fornecedor no banco de dados
    public boolean alterar(Fornecedor fornecedor, int targetID){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        boolean status = false;
        
        try{       
            this.prepStat = this.dbConnection.prepareStatement(alterarST, tipo, concorrencia);         
            prepStat.setInt(1, fornecedor.getId());
            prepStat.setString(2, fornecedor.getNome());
            prepStat.setString(3, fornecedor.getCategoria());
            prepStat.setInt(4, targetID);
            
            int resposta = prepStat.executeUpdate();
            
            System.out.println(resposta + " Linhas alteradas");
            
            status = true;
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }finally{
            return status;
        }
    }
    
    //Exclui fornecedor do banco de dados
    public boolean excluir(int targetID){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        boolean status = false;
        
        try{       
            this.prepStat = FornecedorDAO.dbConnection.prepareStatement(excluirST, tipo, concorrencia);         
            prepStat.setInt(1, targetID);
            
            int resposta = prepStat.executeUpdate();
            
            System.out.println(resposta + " Linhas excluidas");
            
            status = true;
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }finally{
            return status;
        }
    }
    
    //Busca fornecedor específico
    public Fornecedor buscar(int targetID){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        Fornecedor newF = null;
        
        try{
            this.prepStat = this.dbConnection.prepareStatement(buscarST, tipo, concorrencia);
            prepStat.setInt(1, targetID);
            
            this.resultSet = prepStat.executeQuery();
            
            if(resultSet.next()){
                newF = new Fornecedor(resultSet.getInt("fornecedorID"),
                        resultSet.getString("nome"),
                        resultSet.getString("categoria"));
            }
            
        }catch(SQLException e){
            System.out.println("Algo deu errado na busca");
        }finally{
            return newF;
        }
    }
    
    //Seta flag
    public void setFlag(){
        isSet = true;
    }
    
    //Reseta flag
    public void resetFlag(){
        isSet = false;
    }
    
    //Get flag
    public boolean getFlag(){
        return isSet;
    }
}
