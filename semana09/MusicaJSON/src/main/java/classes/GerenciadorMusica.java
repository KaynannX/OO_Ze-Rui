package classes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorMusica {
    private List<Musica> musicas;
    private JSONServiceMusica jsonService;
    private FilePersistence filePersistence;

    public GerenciadorMusica() {
        this.musicas = new ArrayList<>();
        this.jsonService = new JSONServiceMusica();
        this.filePersistence = new FilePersistence();
    }

    public void adicionarMusica(Musica m) {
        this.musicas.add(m);
    }

    public void salvarNoArquivo(String caminho) {
        String json = jsonService.musicasToJSON(this.musicas);
        filePersistence.saveToFile(json, caminho);
    }

    public void carregarDoArquivo(String caminho) {
        String jsonCarregado = filePersistence.loadFromFile(caminho);
        this.musicas = jsonService.JSONToMusicas(jsonCarregado);
    }

    @Override
    public String toString() {
        String out = "--- PLAYLIST ---\n";
        for (Musica m : musicas) out += m.toString() + "\n";
        return out;
    }
}