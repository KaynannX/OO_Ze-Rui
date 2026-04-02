package com.mycompany.sistemacontroleestoque;

import Classes.ControleDeEstoque;
import Classes.Produto;
import java.util.Scanner;

public class SistemaControleEstoque {

    public static void main(String[] args) {

        try (Scanner leitor = new Scanner(System.in)) {
            ControleDeEstoque controle = new ControleDeEstoque();
            int opcao = -1;

            System.out.println("== BEM VINDO AO SISTEMA QUITANDINHA ==");

            while (opcao != 0) {
                System.out.println("--- MENU DE GERENCIAMENTO ---");
                System.out.println("1. Adicionar Produto");
                System.out.println("2. Remover Produto");
                System.out.println("3. Atualizar Quantidade");
                System.out.println("4. Listar Tudo");
                System.out.println("5. Buscar por Codigo");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opcao: ");

                opcao = leitor.nextInt();
                leitor.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o codigo: ");
                        String cod = leitor.nextLine();
                        System.out.print("Digite o nome: ");
                        String nome = leitor.nextLine();
                        System.out.print("Quantidade inicial: ");
                        int qtd = leitor.nextInt();

                        Produto p = new Produto(cod, nome, qtd);
                        controle.adicionarProduto(p);
                        break;

                    case 2:
                        System.out.print("Digite o codigo do produto para remover: ");
                        String codRemover = leitor.nextLine();
                        controle.removerProduto(codRemover);
                        break;

                    case 3:
                        System.out.print("Digite o codigo: ");
                        String codAtu = leitor.nextLine();
                        System.out.print("Nova quantidade: ");
                        int novaQtd = leitor.nextInt();
                        controle.atualizarQuantidade(codAtu, novaQtd);
                        break;

                    case 4:
                        System.out.println("--- LISTA DE ESTOQUE ---");
                        controle.listarProdutos();
                        break;

                    case 5:
                        System.out.print("Digite o codigo para buscar: ");
                        String codBusca = leitor.nextLine();
                        Produto encontrado = controle.buscarProduto(codBusca);
                        if (encontrado != null) {
                            System.out.println("Encontrado: " + encontrado);
                        } else {
                            System.out.println("Produto nao localizado.");
                        }
                        break;

                    case 0:
                        System.out.println("Encerrando o sistema");
                        break;

                    default:
                        System.out.println("Opcao invalida, tente novamente.");
                }
            }
        }
    }

}
