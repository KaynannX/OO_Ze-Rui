package classes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorMusica {
    private List<Musica> musicas;
    private SerializadorCSVMusicas serializador;
    private FilePersistence arquivo;

    public GerenciadorMusica() {
        this.musicas = new ArrayList<>();
        this.serializador = new SerializadorCSVMusicas();
        this.arquivo = new FilePersistence();
    }

    public void adicionarMusica(Musica m) {
        this.musicas.add(m);
    }

    public void salvarNoArquivo(String nomeDoArquivo) {
        String textoFormatado = serializador.paraTexto(this.musicas);
        arquivo.salvar(nomeDoArquivo, textoFormatado);
    }

    public void carregarDoArquivo(String nomeDoArquivo) {
        String textoLido = arquivo.carregar(nomeDoArquivo);
        this.musicas = serializador.deTexto(textoLido);
    }

    @Override
    public String toString() {
        String relatorio = "--- MINHA PLAYLIST ---\n";
        for (Musica m : musicas) {
            relatorio = relatorio + m.toString() + "\n";
        }
        return relatorio;
    }
}
