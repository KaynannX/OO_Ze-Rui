package classes;

import java.util.Scanner;

public class aluno {

    private String nome;
    private int idade;
    private String matricula;
    private int anoIngressado;

    public aluno() {
        this.nome = "";
        this.idade = 0;
        this.matricula = "";
        this.anoIngressado = 0;

    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informacoes do aluno");
        System.out.println("nome:");
        this.nome = leitor.next();
        System.out.println("idade:");
        this.idade = leitor.nextInt();
        System.out.println("matricula:");
        this.matricula = leitor.next();
        System.out.println("ano Ingressado:");
        this.anoIngressado = leitor.nextInt();
    }

    public void imprimir() {
        System.out.println("informacoes do aluno");
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("matricula: " + this.matricula);
        System.out.println("ano Ingressado: " + this.anoIngressado);
    }
    
    public void copiar (aluno outro){
        this.nome = outro.getNome();
        this.idade = outro.getIdade();
        this.matricula = outro.getMatricula();
        this.anoIngressado = outro.getAnoIngressado();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setAnoIngressado(int anoIngressado) {
        this.anoIngressado = anoIngressado;
    }

    public int getAnoIngressado() {
        return this.anoIngressado;
    }
}
