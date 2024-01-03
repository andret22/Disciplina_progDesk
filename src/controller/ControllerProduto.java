
package controller;

import model.Produto;

public abstract class ControllerProduto {
    
    protected Produto produto = new Produto();
    
    abstract void salvar();
    
    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(int id, String nome, float preco, int quantidade){
        produto.setId(id);
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
    }

    public Produto createProduto(int id, String nome, float preco, int quantidade){
        Produto newP = new Produto();
        newP.setId(id);
        newP.setNome(nome);
        newP.setPreco(preco);
        newP.setQuantidade(quantidade);
        return newP;
    }
}
