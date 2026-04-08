package com.mycompany.cbf;

import classes.Tecnico;
import classes.Time;
import java.util.Scanner;

public class CBF {
    
    public static void main(String[] args) {
       
        Tecnico t1 = new Tecnico("Dorival Junior", "Brasileiro", 1962);
        Tecnico t2 = new Tecnico("Abel Ferreira", "Portugues", 1978);

        Time time1 = new Time("Flamengo", "Rio de Janeiro", 1895);
        time1.escalarTecnico(t1);

        Time time2 = new Time("Palmeiras", "Sao Paulo", 1914);
        time2.escalarTecnico(t2);

        System.out.println("--- Times Iniciais ---");
        System.out.println(time1);
        System.out.println(time2);

        System.out.println("\n--- Trocando tecnico do Flamengo... ---");
        Tecnico t3 = new Tecnico("Tite", "Brasileiro", 1961);
        time1.escalarTecnico(t3);

        System.out.println("--- Apos a troca (Time 2 nao deve mudar) ---");
        System.out.println(time1); 
        System.out.println(time2); 

        Scanner leitor = new Scanner(System.in);
        System.out.println("\n--- Adicionqando time ---");
        Time time3 = criarTime(leitor);
        System.out.println(time3);
        
        leitor.close();
    }

    public static Time criarTime(Scanner leitor) {
        System.out.print("Nome do Time: ");
        String nome = leitor.nextLine();
        System.out.print("Cidade: ");
        String cidade = leitor.nextLine();
        System.out.print("Ano de Fundacao: ");
        int ano = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Nome do Tecnico: ");
        String nomeT = leitor.nextLine();
        System.out.print("Nacionalidade: ");
        String nac = leitor.nextLine();
        System.out.print("Ano de Nascimento: ");
        int anoT = leitor.nextInt();

        Time t = new Time(nome, cidade, ano);
        t.escalarTecnico(new Tecnico(nomeT, nac, anoT));
        return t;
    }
}
