
package com.mycompany.musicas;

import classes.musica;

public class Musicas {

    public static void main(String[] args) {
        musica m1 = new musica();
        
        m1.preencher();
        m1.toString();
        m1.imprimir();
        
        musica m2 = new musica();
        
        m2.copiar(m1);
        m2.trocarMusica();
    }
}
