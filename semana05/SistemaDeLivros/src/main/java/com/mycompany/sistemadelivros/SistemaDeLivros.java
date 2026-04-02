package com.mycompany.sistemadelivros;

import classe.livro;
import java.util.ArrayList;
import java.util.List;

public class SistemaDeLivros {

   public static void main(String[] args) {

        List<livro> listLivro = new ArrayList<>();

        livro l1 = new livro();
        l1.setTitulo("Pequeno Principe");

        livro l2 = new livro();
        l2.setTitulo("1984");

        listLivro.add(l1);
        listLivro.add(l2);

        for (livro item : listLivro) {
            System.out.println("Livro: " + item.getTitulo() + " | Local: " + livro.getNomeDaBiblioteca());
        }

        livro.setNomeDaBiblioteca("Biblioteca Nacional");

        System.out.println("\ncom o nome da biblioteca:");

        for (livro item : listLivro) {
            System.out.println("Livro: " + item.getTitulo() + " | Local: " + livro.getNomeDaBiblioteca());
        }

    }
}
