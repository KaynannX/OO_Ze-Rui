package com.mycompany.cadastromusica;

import Classes.Musica;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroMusica {

    public static int imprimirMenu() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("        Suas Musicas");
        System.out.println(" ");
        System.out.println("   1 - Adicionar musica");
        System.out.println("   2 - Remover musica por titulo");
        System.out.println("  3 - Remover musica por artista");
        System.out.println("   4 - Pesquisar musica por titulo");
        System.out.println("   5 - Pesquisar musica por artista");
        System.out.println("   0 - sair");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Escolha uma opcao:");
        return leitor.nextInt();
    }

    public static void main(String[] args) {

        List<Musica> ListaMusica;
        ListaMusica = new ArrayList<>();
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        do {
            opcao = imprimirMenu();
            if (opcao == 1) {
                Musica m1 = new Musica();
                m1.preencher();
                ListaMusica.add(m1);

            } else if (opcao == 2) {
                System.out.println("Informe o titulo:");
                String Musica = leitor.nextLine();

                for (int i = 0; i <= ListaMusica.size() - 1; i++) {
                    Musica mi = ListaMusica.get(i);
                    if (Musica.equals(mi.getTitulo())) {
                        System.out.println("Musica encontrada");
                        ListaMusica.remove(mi);
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Informe o Artista:");
                String Musica = leitor.nextLine();

                for (int i = 0; i <= ListaMusica.size() - 1; i++) {
                    Musica mi = ListaMusica.get(i);
                    if (Musica.equals(mi.getArtista())) {
                        System.out.println("Musica encontrada");
                        ListaMusica.remove(mi);
                    }
                }

            } else if (opcao == 4) {
                System.out.println("Informe o titulo:");
                String Musica = leitor.nextLine();

                for (int i = 0; i <= ListaMusica.size() - 1; i++) {
                    Musica mi = ListaMusica.get(i);
                    if (Musica.equals(mi.getTitulo())) {
                        System.out.println("Musica encontrada");
                        mi.imprimir();
                    }
                }

            } else if (opcao == 5) {
                System.out.println("Informe o artista:");
                String Musica = leitor.nextLine();

                for (int i = 0; i <= ListaMusica.size() - 1; i++) {
                    Musica mi = ListaMusica.get(i);
                    if (Musica.equals(mi.getArtista())) {
                        System.out.println("Musica encontrada");
                        mi.imprimir();
                    }
                }

            }

        } while (opcao != 0);

    }
}
