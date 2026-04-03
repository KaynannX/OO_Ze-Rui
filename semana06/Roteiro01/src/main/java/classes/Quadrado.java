package classes;

public class Quadrado {
    private Ponto p1; 
    private Ponto p2; 
    private Ponto p3; 
    private Ponto p4; 

    public Quadrado(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public boolean isQuadrado() {
        double lado1 = p1.distancia(p2);
        double lado2 = p2.distancia(p3);
        double lado3 = p3.distancia(p4);
        double lado4 = p4.distancia(p1);
        double diag1 = p1.distancia(p3);
        double diag2 = p2.distancia(p4);

        return (lado1 == lado2 && lado2 == lado3 && lado3 == lado4 && diag1 == diag2);
    }

    public double area() {
        if (isQuadrado()) {
            double lado = p1.distancia(p2);
            return lado * lado;
        }
        return 0;
    }

    public double perimetro() {
        if (isQuadrado()) {
            return p1.distancia(p2) * 4;
        }
        return 0;
    }

    public String tipo() {
        if (isQuadrado()) {
            return "Quadrado";
        } else {
            return "Nao e um quadrado";
        }
    }

    public void imprimir() {
        System.out.println("\n--- Teste Quadrado ---");
        if (isQuadrado()) {
            System.out.println("Os pontos formam um quadrado valido");
            System.out.println("Tipo: " + tipo());
            System.out.println("area: " + area());
            System.out.println("Perimetro: " + perimetro());
        } else {
            System.out.println("Nao e um quadrado");
        }
    }
}