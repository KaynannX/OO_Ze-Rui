package classes;

public class Triangulo {
    private Ponto p1;
    private Ponto p2;
    private Ponto p3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public double determinante(){
        double parcela1 = p1.getX() * p2.getY() * 1 + p2.getX() * p3.getY() * 1 + p1.getY() * 1 * p3.getX();
        double parcela2 = p3.getX() * p2.getY() * 1 + p2.getX() * p1.getY() * 1 + p3.getY() * 1 * p1.getX();
        double det = parcela1 - parcela2;
        return det;
    }

    public boolean isColinear(){
        if (this.determinante() == 0)
            return true;
        else {
            return false;
        }
    }

    public double areaTriangulo(){
        double det = this.determinante();
        double areaT = 0;
        
        if(det != 0)
            areaT = det / 2.0;
        return Math.abs(areaT); 
    }

    public double perimetro() {
        return p1.distancia(p2) + p2.distancia(p3) + p3.distancia(p1);
    }

    public String tipo() {
        double d1 = p1.distancia(p2);
        double d2 = p2.distancia(p3);
        double d3 = p3.distancia(p1);

        if (d1 == d2 && d2 == d3) {
            return "Equilatero";
        } else if (d1 == d2 || d2 == d3 || d3 == d1) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
    public void imprimir() {
    System.out.println("--- Dados do Triangulo ---");
    System.out.println("Colinear: " + this.isColinear());
    System.out.println("Area: " + this.areaTriangulo());
    System.out.println("Perimetro: " + this.perimetro());
    System.out.println("Tipo: " + this.tipo());
}
}