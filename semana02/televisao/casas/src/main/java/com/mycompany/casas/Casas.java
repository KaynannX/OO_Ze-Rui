package com.mycompany.casas;

import classes.casa;

public class Casas {

    public static void main(String[] args) {
        casa c1 = new casa();
        c1.preencher();
        c1.imprimir();

        casa c2 = new casa();
        c2.copiar(c1);
        c2.imprimir();
    }
}
