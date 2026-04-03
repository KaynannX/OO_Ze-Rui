
//Dupla: Daniel Kaynann e João Paulo Marques

package com.mycompany.roteiro01;

import classes.Ponto;
import classes.Triangulo;
import classes.Quadrado;

public class Roteiro01 {

    public static void main(String[] args) {
   
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();      
        Ponto p3 = new Ponto();
        
        p1.setX(1); p1.setY(1);
        p2.setX(5); p2.setY(5);
        p3.setX(45); p3.setY(45);

        Triangulo t1 = new Triangulo(p1, p2, p3);
        t1.imprimir();
        
        Ponto q1 = new Ponto(); q1.setX(0); q1.setY(0);
        Ponto q2 = new Ponto(); q2.setX(2); q2.setY(0);
        Ponto q3 = new Ponto(); q3.setX(2); q3.setY(2);
        Ponto q4 = new Ponto(); q4.setX(0); q4.setY(2);

        Quadrado quad = new Quadrado(q1, q2, q3, q4);
        quad.imprimir();
    }
}