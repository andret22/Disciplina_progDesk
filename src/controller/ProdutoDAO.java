package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.Produto;

/**
 *
 * @author andre
 */
public class ProdutoDAO extends DBOperations{
    
      //Statments
    private static final String inserirST = "INSERT INTO PRODUTO VALUES(?, ?, ?, ?);";
    private static final String alterarST = "UPDATE PRODUTO SET produtoID=?, nome=?, preco=?, quantidade=? WHERE produtoID=?";
    private static final String excluirST = "DELETE FROM PRODUTO WHERE produtoID=?";
    private static final String buscarST = "SELECT * FROM PRODUTO WHERE produtoID=?";
    
    //Flags
    private static boolean isSet = false;
    
    
    //Insere Produto no banco de dados
    public boolean inserir(Produto prod){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        boolean status = false;
        
        try{       
            this.prepStat = this.dbConnection.prepareStatement(inserirST, tipo, concorrencia);         
            prepStat.setInt(1, prod.getId());
            prepStat.setString(2, prod.getNome());
            prepStat.setFloat(3, prod.getPreco());
            prepStat.setInt(4, prod.getQuantidade());
            
            int resposta = prepStat.executeUpdate();
            
            System.out.println(resposta + " Linha(s) adicionada(s)");
            
            status = true;
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }finally{
            return status;
        }
    }
    
    //Altera Produto no banco de dados
    public boolean alterar(Produto prod, int targetID){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        boolean status = false;
        
        try{       
            this.prepStat = this.dbConnection.prepareStatement(alterarST, tipo, concorrencia);         
            prepStat.setInt(1, prod.getId());
            prepStat.setString(2, prod.getNome());
            prepStat.setFloat(3, prod.getPreco());
            prepStat.setInt(4, prod.getQuantidade());
            prepStat.setInt(5, targetID);
            
            int resposta = prepStat.executeUpdate();
            
            System.out.println(resposta + " Linha(s) alterada(s)");
            
            status = true;
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }finally{
            return status;
        }
    }
    
    //Exclui Produto do banco de dados
    public boolean excluir(int targetID){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        boolean status = false;
        
        try{       
            this.prepStat = this.dbConnection.prepareStatement(excluirST, tipo, concorrencia);         
            prepStat.setInt(1, targetID);
            
            int resposta = prepStat.executeUpdate();
            
            System.out.println(resposta + " Linha(s) excluida(s)");
            
            status = true;
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }finally{
            return status;
        }
    }
    
    //Busca Produto específico
    public Produto buscar(int targetID){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        Produto newP = null;
        
        try{
            this.prepStat = this.dbConnection.prepareStatement(buscarST, tipo, concorrencia);
            prepStat.setInt(1, targetID);
            
            this.resultSet = prepStat.executeQuery();
            
            if(resultSet.next()){
                newP = new Produto(resultSet.getInt("produtoID"),
                        resultSet.getString("nome"),
                        resultSet.getFloat("preco"),
                    resultSet.getInt("quantidade"));
            }
            
        }catch(SQLException e){
            System.out.println(e);
            System.out.println("Algo deu errado na busca");
        }finally{
            return newP;
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
