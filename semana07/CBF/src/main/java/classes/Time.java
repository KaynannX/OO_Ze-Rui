package classes;

public class Time {
    private String nome;
    private String cidade;
    private int anoFundacao;
    private Tecnico tecnico; 

    public Time() {
        this.nome = "";
        this.cidade = "";
        this.anoFundacao = 0;
        this.tecnico = new Tecnico(); 
    }

    public Time(String nome, String cidade, int anoFundacao) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;
    }

    public void escalarTecnico(Tecnico t) {
        this.tecnico = t; 
    }

    public void copiar(Time outro) {
        this.nome = outro.getNome();
        this.cidade = outro.getCidade();
        this.anoFundacao = outro.getAnoFundacao();
        this.tecnico = outro.getTecnico();
    }

    @Override
    public String toString() {
        String infoTecnico = (tecnico != null) ? tecnico.toString() : "Sem tecnico escalado";
        return "Time: " + nome + " | Cidade: " + cidade + " | Fundado em: " + anoFundacao + 
               "\nTecnico Atual: " + infoTecnico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    
}
