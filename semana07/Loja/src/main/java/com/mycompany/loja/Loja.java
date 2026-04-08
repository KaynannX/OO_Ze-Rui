package com.mycompany.loja;

import classes.Pedido;
import classes.Produto;
import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Produto p1 = new Produto("Teclado Mecanico", "Informatica", 350.00);
        Pedido pedido1 = new Pedido(1001, "16/03/2026", 3, p1);

        System.out.println("--- Pedido 1 (Dados Fixos) ---");
        System.out.println(pedido1);
        System.out.println("Total do pedido: R$" + pedido1.calcularTotal());
        System.out.println("\n-------------------------------------------");

        System.out.println("--- Criando Pedido 2 (Entrada do Usuario) ---");
        Pedido pedido2 = criarPedido(leitor);
        
        System.out.println("\n--- Resumo do Pedido 2 ---");
        System.out.println(pedido2);
        System.out.println("Total do pedido: RS" + pedido2.calcularTotal());
        
        leitor.close();
    }

    public static Pedido criarPedido(Scanner leitor) {
        System.out.print("Digite o numero do pedido: ");
        int num = leitor.nextInt();
        leitor.nextLine();

        System.out.print("Digite a data (dd/mm/aaaa): ");
        String data = leitor.nextLine();

        System.out.print("Digite a quantidade: ");
        int qtd = leitor.nextInt();
        leitor.nextLine(); 

        System.out.println("\n-- Cadastrando o Produto do Pedido --");
        System.out.print("Nome do produto: ");
        String nomeProd = leitor.nextLine();
        
        System.out.print("Categoria: ");
        String catProd = leitor.nextLine();
        
        System.out.print("Preco unitario: ");
        double precoProd = leitor.nextDouble();

        Produto p = new Produto(nomeProd, catProd, precoProd);
        
        return new Pedido(num, data, qtd, p);
    }
}