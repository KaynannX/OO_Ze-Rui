package com.mycompany.musicaJSON;

import classes.GerenciadorMusica;
import classes.Musica;

public class MusicaJSON {
    public static void main(String[] args) {
        GerenciadorMusica gerenciador = new GerenciadorMusica();
        
        gerenciador.adicionarMusica(new Musica("Menino da porteira", "Sergio Reis", 245, 1.15));
        gerenciador.adicionarMusica(new Musica("Bohemian Rhapsody", "Queen", 354, 1.29));

        // Salvando
        gerenciador.salvarNoArquivo("musicas.json");

        // Carregando em um novo objeto para testar
        GerenciadorMusica teste = new GerenciadorMusica();
        teste.carregarDoArquivo("musicas.json");

        System.out.println(teste.toString());
    }
}