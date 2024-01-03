package controller;

import model.Cliente;

public abstract class ControllerCliente {
    
    protected Cliente cliente = new Cliente();
    
    abstract void salvar();

    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void setCliente(long cpf, String nome, String sobrenome, int idade, float valorGasto) {
        this.cliente.setCpf(cpf);
        this.cliente.setNome(nome);
        this.cliente.setSobrenome(sobrenome);
        this.cliente.setIdade(idade);
        this.cliente.setValorGasto(valorGasto);
    }
    
    public Cliente createCliente(long cpf, String nome, String sobrenome, int idade, float valorGasto){
        Cliente newC = new Cliente();
        newC.setCpf(cpf);
        newC.setNome(nome);
        newC.setSobrenome(sobrenome);
        newC.setIdade(idade);
        newC.setValorGasto(valorGasto);
        return newC;
    }
        
     public String getInfo() {     
        StringBuilder line = new StringBuilder();
        
        line.append(this.cliente.getCpf()).append(";");
        line.append(this.cliente.getNome()).append(";");
        line.append(this.cliente.getSobrenome()).append(";");
        line.append(this.cliente.getIdade()).append(";");
        line.append(this.cliente.getValorGasto()).append('\n');
       
        return line.toString();
    }
    
    
}
