package classes;

import java.util.Scanner;

public class Casa {
    private String endereco;
    private double area;
    private int numeroDeQuartos;
    private double preco;

    public Casa() {
        this.endereco = "";
        this.area = 0;
        this.numeroDeQuartos = 0;
        this.preco = 0;
    }

    public void preencher() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe o que for pedido da casa");
        System.out.println("endereco:");
        this.endereco = leitor.next();
        System.out.println("area:");
        this.area = leitor.nextDouble();
        System.out.println("numero De Quartos:");
        this.numeroDeQuartos = leitor.nextInt();
        System.out.println("preco:");
        this.preco = leitor.nextDouble();

    }

    public void imprimir() {
        System.out.println("endereco: " + this.endereco);
        System.out.println("area: " + this.area);
        System.out.println("numero De Quartos: " + this.numeroDeQuartos);
        System.out.println("preco: " + this.preco);
        System.out.println("preco m2: "+ this.calcularPrecoPorM2());
    }

    @Override
    public String toString() {
        return "Casa{" + "endereco=" + endereco + ", area=" + area + ", numeroDeQuartos=" + numeroDeQuartos + ", preco=" + preco + '}';
    }
    
    public void copiar(Casa copia) {
        this.endereco = copia.getEndereco();
        this.area = copia.getArea();
        this.numeroDeQuartos = copia.getNumeroDeQuartos();
        this.preco = copia.getPreco();
    }

    
    public double calcularPrecoPorM2()
    {
        return this.preco / this.area;
    }
    
    
  
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return this.area;
    }

    public void setNumeroDoQuartos(int numeroDeQuartos) {
        this.numeroDeQuartos = numeroDeQuartos;
    }

    public int getNumeroDeQuartos() {
        return this.numeroDeQuartos;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return this.preco;
    }
}
