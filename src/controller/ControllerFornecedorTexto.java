/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author andre
 */
public class ControllerFornecedorTexto extends ControllerFornecedor{
    
    public static ControllerArquivoTexto CFile = new ControllerArquivoTexto();
    private int linha = 0;
   
    //Flags
    private static boolean isSet = false;
     
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
