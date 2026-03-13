
package Classes;

import java.util.Scanner;

public class Filmes {
    private String titulo;
    private String artista;
    private int duracao;
    private double preco;

    public void Filmes() {
        this.titulo = "";
        this.artista = "";
        this.duracao = 0;
        this.preco = 0;
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informacoes do Filme");
        System.out.println("titulo:");
        this.titulo = leitor.next();
        System.out.println("artista:");
        this.artista = leitor.next();
        System.out.println("duracao:");
        this.duracao = leitor.nextInt();
        System.out.println("preco:");
        this.preco = leitor.nextDouble();
    }

    public void copiar(Filmes outro) {
        this.titulo = outro.getTitulo();
        this.artista = outro.getArtista();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();
    }

    public void imprimir() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo=" + titulo + ", artista=" + artista + ", duracao=" + duracao + ", preco=" + preco + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
