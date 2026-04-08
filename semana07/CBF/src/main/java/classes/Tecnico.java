package classes;

public class Tecnico {
    private String nome;
    private String nacionalidade;
    private int anoNascimento;

    public Tecnico() {
        this.nome = "";
        this.nacionalidade = "";
        this.anoNascimento = 0;
    }

    public Tecnico(String nome, String nacionalidade, int anoNascimento) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.anoNascimento = anoNascimento;
    }

    public void copiar(Tecnico outro) {
        this.nome = outro.getNome();
        this.nacionalidade = outro.getNacionalidade();
        this.anoNascimento = outro.getAnoNascimento();
    }

    @Override
    public String toString() {
        return nome + " (" + nacionalidade + ", Nascido em " + anoNascimento + ")";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

   
}
