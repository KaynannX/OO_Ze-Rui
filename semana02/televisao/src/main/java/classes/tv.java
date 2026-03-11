
package classes;

import java.util.Scanner;

public class tv {
    
    private String marca;
    private double tamanho;
    private String resolucao;
    private double preco;

    public tv() {
        this.marca = "";
        this.tamanho = 0;
        this.resolucao = "";
        this.preco = 0;

    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informacoes da tv");
        System.out.println("marca:");
        this.marca = leitor.next();
        System.out.println("tamanho:");
        this.tamanho = leitor.nextDouble();
        System.out.println("resolucoa:");
        this.resolucao = leitor.next();
        System.out.println("preco:");
        this.preco = leitor.nextDouble();

    }
    
    public void imprimir(){
        System.out.println("configuracao da tv:");
        System.out.println("marca: "+ this.marca);
        System.out.println("tamanho: "+ this.tamanho);
        System.out.println("resolucao: "+ this.resolucao);
        System.out.println("preco: "+ this.preco);
    }
    
    public void copiar(tv outro){
        this.marca = outro.getMarca();
        this.tamanho = outro.getTamanho();
        this.resolucao = outro.getResolucao();
        this.preco = outro.getPreco();
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getResolucao() {
        return this.resolucao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }
}
