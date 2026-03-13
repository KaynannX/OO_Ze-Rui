
package com.mycompany.cadastrodefilme;

import Classes.Filmes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeFilme {

     public static int imprimirMenu() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        Seus Filmes");
        System.out.println(" ");
        System.out.println("   1 - Adicionar Filme");
        System.out.println("   2 - Remover Filme por titulo");
        System.out.println("  3 - Remover Filme por artista");
        System.out.println("   4 - Pesquisar Filme por titulo");
        System.out.println("   5 - Pesquisar Filme por artista");
        System.out.println("   0 - sair");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Escolha uma opcao:");
        return leitor.nextInt();
    }

    public static void main(String[] args) {

        List<Filmes> ListaFilmes;
        ListaFilmes = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        do {
            opcao = imprimirMenu();
            if (opcao == 1) {
                Filmes f1 = new Filmes();
                f1.preencher();
                ListaFilmes.add(f1);

            } else if (opcao == 2) {
                System.out.println("Informe o titulo:");
                String Filmes = leitor.nextLine();

                for (int i = 0; i <= ListaFilmes.size() - 1; i++) {
                    Filmes fi = ListaFilmes.get(i);
                    if (Filmes.equals(fi.getTitulo())) {
                        System.out.println("Filme encontrada");
                        ListaFilmes.remove(fi);
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Informe o Artista:");
                String Filmes = leitor.nextLine();

                for (int i = 0; i <= ListaFilmes.size() - 1; i++) {
                    Filmes fi = ListaFilmes.get(i);
                    if (Filmes.equals(fi.getArtista())) {
                        System.out.println("Filme encontrado");
                        ListaFilmes.remove(fi);
                    }
                }

            } else if (opcao == 4) {
                System.out.println("Informe o titulo:");
                String Filmes = leitor.nextLine();

                for (int i = 0; i <= ListaFilmes.size() - 1; i++) {
                    Filmes fi = ListaFilmes.get(i);
                    if (Filmes.equals(fi.getTitulo())) {
                        System.out.println("Filme encontrado");
                        fi.imprimir();
                    }
                }

            } else if (opcao == 5) {
                System.out.println("Informe o artista:");
                String Filmes = leitor.nextLine();

                for (int i = 0; i <= ListaFilmes.size() - 1; i++) {
                    Filmes fi = ListaFilmes.get(i);
                    if (Filmes.equals(fi.getArtista())) {
                        System.out.println("Filme encontrado");
                        fi.imprimir();
                    }
                }

            }

        } while (opcao != 0);

    }
}
