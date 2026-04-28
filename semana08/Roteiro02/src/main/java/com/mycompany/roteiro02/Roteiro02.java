package com.mycompany.roteiro02;



/* TRABALHO FEITO POR: DANEIL KAYNANN DIDRES TEIXEIRA E JOÃO PAULO MARQUES OLIVEIRA.
   LINK DO YOUTUBE: https://youtu.be/iPC0JGviW8E
*/ 


import classes.Aeroporto;
import classes.Passageiro;
import classes.Voo;
import java.util.List;

public class Roteiro02 {

    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto("Aeroporto Internacional de Brasilia", "Brasilia");
        
        Voo voo1 = new Voo("BR123", "Nova York", 100);
        Passageiro passageiro1 = new Passageiro("Joao Silva", "12345678900");

        voo1.adicionarEscala("Miami");
        voo1.adicionarEscala("Orlando");

        aeroporto.adicionarVoo(voo1);
        voo1.adicionarPassageiro(passageiro1);
        
        passageiro1.getSistemaFidelidade().adicionarPontos(500);

        aeroporto.iniciarVoo("BR123");

        System.out.println("\n--- Relatorio de Operacoes ---");
        List<Voo> voosPrejuizo = aeroporto.calcularVoosComPrejuizo();
        
        if (voosPrejuizo.isEmpty()) {
            System.out.println("Nenhum voo com prejuízo.");
        } else {
            System.out.println("Voos que terao prejuizo (menos de 5 passageiros):");
            for (int i = 0; i < voosPrejuizo.size(); i++) {
                System.out.println("- Codigo: " + voosPrejuizo.get(i).getNumeroDoVoo());
            }
        }
    }
}
