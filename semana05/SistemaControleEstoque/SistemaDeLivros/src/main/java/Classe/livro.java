package classe;

import java.util.Scanner;

public class livro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private double preco;
    private static String nomeDaBiblioteca;

    public livro() {
        this.titulo = "";
        this.autor = "";
        this.numPaginas = 0;
        this.preco = 0;
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informacoes sobre o livro");
        System.out.println("tituolo: ");
        this.titulo = leitor.next();
        System.out.println("autor:");
        this.autor = leitor.next();
        System.out.println("numero de paginas:");
        this.numPaginas = leitor.nextInt();
        System.out.println("preco:");
        this.preco = leitor.nextDouble();

    }

    public void imprimir() {
        System.out.println("informacoes do livro");
        System.out.println("titulo: " + this.titulo);
        System.out.println("autor: " + this.autor);
        System.out.println("numero de paginas: " + this.numPaginas);
        System.out.println("preco: " + this.preco);
    }

    public void copiar(livro copy) {
        this.titulo = copy.getTitulo();
        this.autor = copy.getAutor();
        this.numPaginas = copy.getNumPaginas();
        this.preco = copy.getPreco();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public static String getNomeDaBiblioteca(){
        return nomeDaBiblioteca;
    }
    
    public static void setNomeDaBiblioteca(String nomeDaBiblioteca ){
        livro.nomeDaBiblioteca = nomeDaBiblioteca;
    }

}
