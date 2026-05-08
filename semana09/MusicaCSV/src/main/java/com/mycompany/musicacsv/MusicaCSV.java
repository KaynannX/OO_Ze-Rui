package com.mycompany.musicacsv;

import classes.GerenciadorMusica;
import classes.Musica;

public class MusicaCSV {
    public static void main(String[] args) {
        testeSerializacaoCSVMusica();
    }

    public static void testeSerializacaoCSVMusica() {
        GerenciadorMusica gerenciador = new GerenciadorMusica();

        gerenciador.adicionarMusica(new Musica("Menino da porteira", "Sergio Reis", 245, 1.15));
        gerenciador.adicionarMusica(new Musica("Amigo", "Milton Nascimento", 270, 0.99));
        gerenciador.adicionarMusica(new Musica("Bohemian Rhapsody", "Queen", 354, 1.29));

        String caminho = "musicas.csv";
        System.out.println("Salvando musicas em " + caminho + "...");
        gerenciador.salvarNoArquivo(caminho);

        System.out.println("Limpando memoria e carregando do arquivo...");
        gerenciador = new GerenciadorMusica(); 
        gerenciador.carregarDoArquivo(caminho);
        System.out.println(gerenciador.toString());
    }
}
 
