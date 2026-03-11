package com.mycompany.televisao;

import classes.tv;

public class Televisao {

    public static void main(String[] args) {
        tv t1 = new tv();
        t1.preencher();
        t1.imprimir();
        
        tv t2 = new tv();
        t2.copiar(t1);
        t2.imprimir();
        
    }
}
