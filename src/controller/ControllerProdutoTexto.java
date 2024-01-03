package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ControllerProdutoTexto extends ControllerProduto {
    
    public static ControllerArquivoTexto CFile = new ControllerArquivoTexto();
    private int linha = 0;

    //Flags
    private static boolean isSet = false;
    
    public String getInfo() {     
        StringBuilder line = new StringBuilder();
        
        line.append(this.produto.getId()).append(";");
        line.append(this.produto.getNome()).append(";");
        line.append(this.produto.getPreco()).append(";");
        line.append(this.produto.getQuantidade()).append('\n');
       
        return line.toString();
    }
    
    @Override
    public void salvar(){
        CFile.setTexto(getInfo());
        CFile.escrever(true);
    }
    
    public String[] buscar(int id) {
        try {
            this.linha = 0;
            BufferedReader leitor = new BufferedReader(new FileReader(CFile.getArquivo()));
            String line;
            
            while ((line = leitor.readLine()) != null) {
                String[] texto = line.split(";");
                if(texto[0].equals(String.valueOf(id))){
                    leitor.close();
                    return texto;
                }
                this.linha++;
            }
            leitor.close(); 
            return null;
        } catch (FileNotFoundException ex) {
            return null;
        } catch (IOException ex) {
            return null;
        }
    }
    
    public int getLinha() {
        return linha;
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
