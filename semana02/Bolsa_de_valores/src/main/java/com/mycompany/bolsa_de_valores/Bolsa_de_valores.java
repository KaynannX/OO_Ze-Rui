package com.mycompany.bolsa_de_valores;

import Classes.Ativo;

public class Bolsa_de_valores {

    public static void main(String[] args) {
        Ativo a1 = new Ativo();
        Ativo a2 = new Ativo();
        Ativo a3 = new Ativo();

        System.out.println("~coloque as informacoes dos seus Ativos~");
        a1.preencher();
        a2.preencher();
        a3.preencher();

        // acrescentei o lucro do dia e o total parcial
        
        System.out.println("Seus investimento:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        double total = a1.totalPar() + a2.totalPar() + a3.totalPar();

        System.out.println("Total: " + total);

    }
}
