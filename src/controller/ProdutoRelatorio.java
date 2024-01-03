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


public class ProdutoRelatorio{

    //Atributos
    public static final String pasta_relatorios = System.getProperty("user.dir") + "/src/relatorios/";
    public static final File relatorio_compilado = new File(pasta_relatorios, "produtos.jrxml");
    private Connection conn = null;
    
    //STATUS
    public static final int SUCCESS = 1;
    public static final int EMPTY_REPORT = 0;
    public static final int EXCEPTION = -1;
    
    //Metodos
    public int imprimeRelatorio(){
        JasperPrint impressao;
        int status = SUCCESS;
        try {
            
            //Abre conexão com o banco de dados, se não existir
            if(this.conn == null){
                this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "progDesk", "123456");
                System.out.println("Conectei");
            }
            
            FileInputStream arquivo = new FileInputStream(relatorio_compilado);
            
            // caso seja necessário, compila o relatório (caso deseja usar o jrxml)
            JasperReport relatorio = JasperCompileManager.compileReport(arquivo);
            
            //Preenche o relatório
            impressao = JasperFillManager.fillReport(
                    relatorio,
                    null,
                    this.conn);

            
            //Exibe o relatório      
            JasperViewer.viewReport(impressao, false);
            
            this.conn.close();
            
            return SUCCESS;
            
        } catch (JRException | FileNotFoundException erro) {
            System.err.println("Não foi possível exportar o relatório.\n\n" + erro);
            return EXCEPTION;
        } catch(SQLException sqlE){
            return EXCEPTION;
        }
    }
    
}
