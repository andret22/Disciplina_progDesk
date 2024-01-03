package model;

import java.io.Serializable;


public class Fornecedor implements Serializable  {
    private static long serialVersionUID = 1L;
    private int id;
    private String nome;
    private String categoria;

    public Fornecedor(){}
    
    public Fornecedor(int id, String nome, String categoria){
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
    
}
