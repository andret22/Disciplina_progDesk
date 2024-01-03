package controller;


import java.io.EOFException;
import java.io.File;
import javax.swing.JFileChooser;
public abstract class ControllerArquivo {
    
    protected File arquivo = null;
    private boolean hasAFile = false;

    public boolean isHasAFile() {
        return hasAFile;
    }
   
    public abstract boolean ler() throws EOFException;
    public abstract boolean escrever(boolean append);
    

    public File getArquivo() {
        return arquivo;
    }

    public boolean setArquivo(String TextoBotao) {
        this.arquivo = null;
        String pastainicial = System.getProperty("user.dir");
        JFileChooser chooser = new JFileChooser(pastainicial);
        if (chooser.showDialog(null, TextoBotao) == JFileChooser.APPROVE_OPTION) {
            this.arquivo = chooser.getSelectedFile();
            this.hasAFile = true;
            return true;
        }
        return false;
    }
    
     //public abstract boolean atualizaLinha(String[] original, String[] nova, int numLinha);
    
}
