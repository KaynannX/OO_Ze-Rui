
package com.mycompany.livros;

import classes.livro;

public class Livros {

    public static void main(String[] args) {
        livro l1 = new livro();
        l1.preencher();
        l1.imprimir();
        
        livro l2 = new livro();
        l2.copiar(l1);
        l2.imprimir();
        
        
    }
}
