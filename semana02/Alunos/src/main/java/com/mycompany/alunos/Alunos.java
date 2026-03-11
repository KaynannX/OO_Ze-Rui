
package com.mycompany.alunos;

import classes.aluno;


public class Alunos {

    public static void main(String[] args) {
       aluno a1 = new aluno();
       a1.preencher();
       a1.imprimir();
       
       aluno a2 = new aluno();
       a2.copiar(a1);
       a2.imprimir();
    }
}
