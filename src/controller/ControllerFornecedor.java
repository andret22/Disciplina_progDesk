package controller;

import model.Fornecedor;

public abstract class ControllerFornecedor {
    
    protected Fornecedor fornecedor = new Fornecedor();
    
    abstract void salvar();

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int id, String nome, String categoria) {
        fornecedor.setId(id);
        fornecedor.setNome(nome);
        fornecedor.setCategoria(categoria);
    }
    
    public String getInfo() {     
        StringBuilder line = new StringBuilder();
        
        line.append(this.fornecedor.getId()).append(";");
        line.append(this.fornecedor.getNome()).append(";");
        line.append(this.fornecedor.getCategoria()).append('\n');
       
        return line.toString();
    }
    
    public Fornecedor createFornecedor(int id, String nome, String categoria){
        Fornecedor newF = new Fornecedor();
        newF.setNome(nome);
        newF.setId(id);
        newF.setCategoria(categoria);
        return newF;
    }
    
}
