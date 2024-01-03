package controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;

public class ControllerFornecedorBinario extends ControllerFornecedor {

    //Flags
    private static boolean isSet = false;
    
    public static ControllerArquivoBinario BFile = new ControllerArquivoBinario() {
        
        @Override
        public boolean escrever(boolean append) {
            if (arquivo != null) {
                try {
                    ObjectOutputStream escritor;
                    escritor = CriaEscritorObjeto(this.arquivo, append);
                    escritor.writeObject((Fornecedor) BFile.getObject());
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

    };

    @Override
    //Salva Produto no arquivo binário
    public void salvar() {
        BFile.escrever(true);
    }

    //Busca por um Produto específico dentro do arquivo binário e o retorna
    public Fornecedor buscar(long id) {
        try (FileInputStream fileInputStream = new FileInputStream(BFile.getArquivo()); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            while (true) {
                try {
                    Fornecedor temp = (Fornecedor) objectInputStream.readObject();
                    if (temp != null && temp.getId() == id) {
                        return temp;
                    }
                } catch (EOFException e) {
                    System.out.println("Fim do arquivo");
                    return null;
                } catch (IOException IOErr) {
                    System.out.println("Excessão IO");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ControllerClienteBinario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControllerClienteBinario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ControllerClienteBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    //Busca por um Produto específico dentro do arquivo e o remove
    public boolean remover(long targetID) {
        boolean status = false;
        try {
            List<Fornecedor> fornecedores = new ArrayList<>();

            while (true) {
                try {
                    BFile.ler();
                    if (BFile.getObject() instanceof Fornecedor fornecedor) {
                        if (fornecedor.getId()!= targetID) {
                            fornecedores.add(fornecedor);
                        }
                    }
                } catch (EOFException e) {
                    break;
                }
            }

            FileOutputStream fileOutputStream = new FileOutputStream(BFile.getArquivo());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Fornecedor fornecedorLocal : fornecedores) {
                objectOutputStream.writeObject(fornecedorLocal);
            }

            objectOutputStream.close();
            fileOutputStream.close();

            status = true;

        } catch (IOException e) {
            System.out.println("Erro ao apagar");
            status = false;

        } finally {
            BFile.fechar();
            return status;
        }
    }
    
    //Busca por um Fornecedor específico dentro do arquivo e altera seus dados
    public boolean alterar(Fornecedor tFornecedor){
        boolean status = false;
        try {
            List<Fornecedor> fornecedores = new ArrayList<>();

            while (true) {
                try {
                    BFile.ler();
                    if (BFile.getObject() instanceof Fornecedor) {
                        Fornecedor forni = (Fornecedor) BFile.getObject();
                        if (forni.getId() == tFornecedor.getId()) {
                            fornecedores.add(tFornecedor);
                        }else{
                            fornecedores.add(forni);
                        }
                    }
                } catch (EOFException e) {
                    break;
                }
            }

            FileOutputStream fileOutputStream = new FileOutputStream(BFile.getArquivo());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            for (Fornecedor fornecedorLocal : fornecedores) {
                objectOutputStream.writeObject(fornecedorLocal);
            }

            objectOutputStream.close();
            fileOutputStream.close();

            status = true;

        } catch (IOException e) {
            System.out.println("Erro ao apagar");
            status = false;

        } finally {
            BFile.fechar();
            return status;
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
