package Classes;

import java.util.Scanner;

public class Ativo {

    private String nomeEmpresa;
    private double precoAcao;
    private double qtdAcoes;
    private double variacaoDiaria;

    public Ativo() {
        this.nomeEmpresa = "";
        this.precoAcao = 0.0;
        this.qtdAcoes = 0.0;
        this.variacaoDiaria = 0.0;
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Me de as informacoes do Ativo ");
        System.out.println("nome da empresa: ");
        this.nomeEmpresa = leitor.next();
        System.out.println("preco da acao: ");
        this.precoAcao = leitor.nextDouble();
        System.out.println("quantidade de acao: ");
        this.qtdAcoes = leitor.nextDouble();
        System.out.println("variacao diaria: ");
        this.variacaoDiaria = leitor.nextDouble();
    }

    public void imprimir() {
        System.out.println("informacoes do Ativo");
        System.out.println("Empresa: " + this.nomeEmpresa);
        System.out.println("Preco da Acao: " + this.precoAcao);
        System.out.println("Quantidade de Acao: " + this.qtdAcoes);
        System.out.println("Variacao Diaria: " + this.variacaoDiaria);
    }

    @Override
    public String toString() {
        return nomeEmpresa + " | Preco: " + precoAcao + " | Qtd: " + qtdAcoes + " | variacao:" + variacaoDiaria + " | investido: " + calcularPosicaoDoAtivo() + " | Day Trade: " + dayTrade() + " | Parcial: " + totalPar();
    }

    public void copiar(Ativo outro) {
        this.nomeEmpresa = outro.getNomeEmpresa();
        this.precoAcao = outro.getPrecoAcao();
        this.qtdAcoes = outro.getQtdAcoes();
        this.variacaoDiaria = outro.getVariacaoDiaria();
    }

    public double calcularPosicaoDoAtivo() {

        return this.precoAcao * this.qtdAcoes;
    }

    public double dayTrade() {
        return this.calcularPosicaoDoAtivo() * (this.variacaoDiaria / 100);
    }

    public double totalPar() {
        return this.dayTrade() + this.calcularPosicaoDoAtivo();
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getPrecoAcao() {
        return precoAcao;
    }

    public void setPrecoAcao(double precoAcao) {
        this.precoAcao = precoAcao;
    }

    public double getQtdAcoes() {
        return qtdAcoes;
    }

    public void setQtdAcoes(double qtdAcoes) {
        this.qtdAcoes = qtdAcoes;
    }

    public double getVariacaoDiaria() {
        return variacaoDiaria;
    }

    public void setVariacaoDiaria(double variacaoDiaria) {
        this.variacaoDiaria = variacaoDiaria;
    }

}
