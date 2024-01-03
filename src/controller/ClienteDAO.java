package controller;


import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;

public class ClienteDAO extends DBOperations {
    

    //Statments
    private static final String inserirST = "INSERT INTO CLIENTE VALUES(?, ?, ?, ?, ?);";
    private static final String alterarST = "UPDATE CLIENTE SET cpf=?, nome=?, sobrenome=?, idade=?, valor=? WHERE cpf=?";
    private static final String excluirST = "DELETE FROM CLIENTE WHERE cpf=?";
    private static final String buscarST = "SELECT * FROM CLIENTE WHERE cpf=?";
    
    //Flags
    private static boolean isSet = false;
   
    
    //Insere Cliente no banco de dados
    public boolean inserir(Cliente cliente){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        boolean status = false;
        
        try{       
            this.prepStat = this.dbConnection.prepareStatement(inserirST, tipo, concorrencia);         
            prepStat.setLong(1, cliente.getCpf());
            prepStat.setString(2, cliente.getNome());
            prepStat.setString(3, cliente.getSobrenome());
            prepStat.setInt(4, cliente.getIdade());
            prepStat.setFloat(5, cliente.getValorGasto());
            
            int resposta = prepStat.executeUpdate();
            
            System.out.println(resposta + " Linhas adicionadas");
            
            status = true;
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }finally{
            return status;
        }
    }
    
    //Altera Cliente no banco de dados
    public boolean alterar(Cliente cliente, long targetCPF){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        boolean status = false;
        
        try{       
            this.prepStat = this.dbConnection.prepareStatement(alterarST, tipo, concorrencia);         
            prepStat.setLong(1, cliente.getCpf());
            prepStat.setString(2, cliente.getNome());
            prepStat.setString(3, cliente.getSobrenome());
            prepStat.setInt(4, cliente.getIdade());
            prepStat.setFloat(5, cliente.getValorGasto());
            prepStat.setLong(6, targetCPF);
            
            int resposta = prepStat.executeUpdate();
            
            System.out.println(resposta + " Linhas alteradas");
            
            status = true;
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }finally{
            return status;
        }
    }
    
    //Exclui Cliente do banco de dados
    public boolean excluir(long targetCPF){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        boolean status = false;
        
        try{       
            this.prepStat = this.dbConnection.prepareStatement(excluirST, tipo, concorrencia);         
            prepStat.setLong(1, targetCPF);
            
            int resposta = prepStat.executeUpdate();
            
            System.out.println(resposta + " Linhas excluidas");
            
            status = true;
            
        }catch(SQLException sqle){
            System.out.println(sqle);
        }finally{
            return status;
        }
    }
    
    //Busca Cliente específico
    public Cliente buscar(long targetCPF){
        int tipo = ResultSet.TYPE_SCROLL_SENSITIVE;
        int concorrencia = ResultSet.CONCUR_UPDATABLE;
        Cliente newC = null;
        
        try{
            this.prepStat = this.dbConnection.prepareStatement(buscarST, tipo, concorrencia);
            prepStat.setLong(1, targetCPF);
            
            this.resultSet = prepStat.executeQuery();
            
            if(resultSet.next()){
                newC = new Cliente(resultSet.getLong("cpf"),
                    resultSet.getString("nome"),
                    resultSet.getString("sobrenome"),
                    resultSet.getInt("idade"),
                    resultSet.getFloat("valor"));
            }
            
        }catch(SQLException e){
            System.out.println("Algo deu errado na busca");
        }finally{
            return newC;
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
