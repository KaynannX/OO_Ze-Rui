package classes;

public class Musica {
    private String titulo;
    private String artista;
    private int duracao;
    private double preco;

    public Musica(String titulo, String artista, int duracao, double preco) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    public Musica() {
    }

    @Override
    public String toString() {
        return "Musica: " + titulo + " | Artista: " + artista + " | RS " + preco;
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