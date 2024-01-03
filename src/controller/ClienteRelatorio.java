package controller;

//Imports
import static com.lowagie.text.pdf.PdfFileSpecification.url;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import java.sql.*;


public class ClienteRelatorio{

    //Atributos
    public static final String pasta_relatorios = System.getProperty("user.dir") + "/src/relatorios/";
    public static final File relatorio_compilado = new File(pasta_relatorios, "cliente.jrxml");
    private Connection conn = null;
    
    //STATUS
    public static final int SUCCESS = 1;
    public static final int EMPTY_REPORT = 0;
    public static final int EXCEPTION = -1;
    
    //Metodos
    private Map constroiParametrosCliente(long P1) {
        Map params = new HashMap();

        params.put("P1", P1);
        return params;
    }

    
    public int imprimeRelatorio(long cpf){
        JasperPrint impressao;
        try {
            
            //Abre conexão com o banco de dados, se não existir
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "progDesk", "123456");
            if (this.conn == null){
                return EXCEPTION;
            }

            
            FileInputStream arquivo = new FileInputStream(relatorio_compilado);
            
            // caso seja necessário, compila o relatório (caso deseja usar o jrxml)
            JasperReport relatorio = JasperCompileManager.compileReport(arquivo);
            
            //Preenche o relatório
            impressao = JasperFillManager.fillReport(
                    relatorio,
                    constroiParametrosCliente(cpf),
                    this.conn);

            
            //Checa se o relatório está vazio
            if (impressao.getPages().isEmpty()) {
                System.out.println("Vazio");

                return EMPTY_REPORT;
            }
            
            //Exibe o relatório      
            JasperViewer.viewReport(impressao, false);
            
            return SUCCESS;
            
        } catch (JRException | FileNotFoundException erro) {
            System.err.println("Não foi possível exportar o relatório.\n\n" + erro);
            
            return EXCEPTION;
        } catch(SQLException sqlE){
            
            return EXCEPTION;
        }finally{
            try{
                //Fecha conexão com o banco de dados
                this.conn.close();   
            }catch(SQLException sqlE){
                System.out.println("Erro ao fechar a sessão sql");
            }
        }
    }
    
}
