package model;

import java.io.Serializable;

public class Cliente implements Serializable {
    private static long serialVersionUID = 1L;
    protected long cpf;
    protected String nome;
    protected String sobrenome;
    protected int idade;
    protected float valorGasto;

    public Cliente(){}

    public Cliente(long cpf, String nome, String sobrenome, int idade, float valorGasto) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.valorGasto = valorGasto;
        this.cpf = cpf;
    }
    
    
    
    
    public float getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(float valorGasto) {
        this.valorGasto = valorGasto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }


    
}
