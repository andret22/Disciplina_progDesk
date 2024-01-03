package controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ControllerArquivoTexto extends ControllerArquivo {

    private String texto = null;
    private BufferedReader leitor = null;
    private BufferedWriter escritor = null;


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }


    @Override
    public boolean ler() {
        StringBuilder line = new StringBuilder();
        try {
            leitor = new BufferedReader(new FileReader(arquivo));
            while (leitor.ready()) {
                line.append(leitor.readLine()).append("\n");
            }
            leitor.close();
            setTexto(line.toString());
            return true;
        } catch (FileNotFoundException erro) {
            //erro.printStackTrace(); //usado para debug
            System.err.println(erro.getMessage() + "Arquivo não encontrado.");
            return false;
        } catch (IOException erro) {
            System.err.println(erro.getMessage() + "Erro ao ler arquivo.");
            return false;
        }
    }

    @Override
    public boolean escrever(boolean append) {
        if (arquivo != null) {
            try {
                escritor = new BufferedWriter(new FileWriter(arquivo, append));
                escritor.write(getTexto());
                escritor.close();
                return true;
            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "Erro ao ler arquivo.");
                return false;
            }
        } else {
            return false;
        }
    }
    
    public boolean atualizaLinha(String[] original, String[] nova, int numLinha) {
    if (original != null) {
        try {
            File file = this.getArquivo();
            File tempFile = new File("tempfile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(this.arquivo));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String textoAtual;
            int linha = 0;

            while ((textoAtual = reader.readLine()) != null) {
                if (linha == numLinha) {

                    for (int i = 0; i < nova.length; i++) {
                        writer.write(nova[i]);
                        if (i < nova.length - 1) {
                            writer.write(";");
                        }
                    }
                    writer.newLine();
                } else {
                    writer.write(textoAtual);
                    writer.newLine();
                }
                linha++;
            }

            reader.close();
            writer.close();
            
            if (file.delete()) {
                tempFile.renameTo(file);
                return true;
            } else {
                return false;
            }
        } catch (IOException e) {
            return false;
        }
    } else {
        return false;
    }
}
    

}