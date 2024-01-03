package controller;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author fabricio
 */
public class ControllerArquivoBinario extends ControllerArquivo {

    private Object object = null;
    private ObjectInputStream leitor = null;
    private ObjectOutputStream escritor = null;

    //Retorna object
    public Object getObject() {
        return this.object;
    }

    //Setta object
    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    // Lê objeto
    public boolean ler() throws EOFException {
        try {
            if (leitor == null) {
                leitor = new ObjectInputStream(new FileInputStream(arquivo));
            }

            this.object = leitor.readObject();
            return true;
        } catch (EOFException eofException) {
            throw eofException; // Rethrow EOFException when you reach the end of the file.
        } catch (ClassNotFoundException erro) {
            System.err.println(erro.getMessage() + "Classe não encontrada.");
            return false;
        } catch (IOException erro) {
            System.err.println(erro.getMessage() + "Erro ao ler arquivo binário.");
            return false;
        }
    }

    //Fecha leitor
    public boolean fechar() {
        try {
            leitor.close();
            this.leitor = null;
            return true;
        } catch (IOException e) {
            System.err.println("Ocooreu um erro ao fechar o arquivo binario!!!");
        } finally {
            return false;
        }
    }

    @Override
    //Espreve Object no arquivo binário
    public boolean escrever(boolean append) {
        if (arquivo != null) {
            try {
                escritor = CriaEscritorObjeto(this.arquivo, append);
                escritor.writeObject(object);
                escritor.close();
                return true;
            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "Erro ao escrever arquivo binário.");
                return false;
            }
        } else {
            return false;
        }
    }

    //Cria leitor para criar ou não cabeçalho
    public static ObjectOutputStream CriaEscritorObjeto(File arquivo, boolean append) {
        ObjectOutputStream out = null;
        try {
            if (arquivo.exists()) {
                FileOutputStream fos = new FileOutputStream(arquivo, append);
                out = new ObjectOutputStream(fos) {

                    @Override
                    protected void writeStreamHeader() {
                        //Não escreve cabeçalho
                    }
                };
            } else {
                FileOutputStream fos = new FileOutputStream(arquivo, append);
                out = new ObjectOutputStream(fos);
            }
        } catch (IOException erro) {
            System.out.println("Erro ao criar arquivo. " + erro);
        }
        return out;
    }

    //Get leito
    public ObjectInputStream getLeitor() {
        return leitor;
    }

    //Get escritor
    public ObjectOutputStream getEscritor() {
        return escritor;
    }

    public void setLeitor(ObjectInputStream leitor) {
        this.leitor = leitor;
    }

    public void setEscritor(ObjectOutputStream escritor) {
        this.escritor = escritor;
    }

}
