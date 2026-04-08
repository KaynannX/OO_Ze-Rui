package classes;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private String data;
    private int quantidade;
    private List<Produto> produto;
    
    
    public Pedido(){
        this.numero = 0;
        this.data = "";
        this.quantidade = 0;
        this.produto = new ArrayList<>();
       
    }
    public Pedido(int numero, String data, int quantidade, Produto p) {
    this.numero = numero;
    this.data = data;
    this.quantidade = quantidade;
    this.produto = new ArrayList<>(); 
    this.produto.add(p);              
}
    
    
    public double calcularTotal(){
        double somaPrecos = 0.0;

    for (Produto p : this.produto) {
        somaPrecos += p.getPreco();
    }
    return somaPrecos * this.quantidade;
    }



    @Override
    public String toString() {
        return "Pedido{" + "numero=" + numero + ", data=" + data + ", quantidade=" + quantidade + ", produto=" + produto + '}';
    }

    public void copiar (Pedido outro){
        this.numero = outro.getNumero();
        this.data = outro.getData();
        this.quantidade = outro.getQuantidade();
        this.produto = outro.getProduto();
    }
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    public List<Produto> getProduto() {
    return produto;
}
    public void setProduto(List<Produto> produto) {
     this.produto = produto;
}
    
    
}
