package Classes;

public class Produto {
    
    private String codigo;
    private String nome;
    private int quantidadeEmEstoque;
    
    public  Produto(){
        this.codigo = "";
        this.nome = "";
        this.quantidadeEmEstoque = 0;
        
    }
    
   public Produto(String codigo, String nome, int quantidadeEmEstoque) {
    this.codigo = codigo;
    this.nome = nome;
    this.quantidadeEmEstoque = quantidadeEmEstoque;
}

     @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    
    
    
    
}
