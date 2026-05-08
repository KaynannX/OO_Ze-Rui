
package classes;

import java.util.ArrayList;
import java.util.List;

public class SerializadorCSVMusicas {
    
    public String paraTexto(List<Musica> lista) {
        String texto = "titulo;artista;duracao;preco\n"; 
        
        for (Musica m : lista) {
            texto = texto + m.getTitulo() + ";" 
                          + m.getArtista() + ";" 
                          + m.getDuracao() + ";" 
                          + m.getPreco() + "\n";
        }
        return texto;
    }

    public List<Musica> deTexto(String dados) {
        List<Musica> listaMusicas = new ArrayList<>();
        String[] linhas = dados.split("\n");
        
        for (int i = 1; i < linhas.length; i++) {
            String linhaAtual = linhas[i];
            String[] partes = linhaAtual.split(";");
            
            if (partes.length == 4) {
                String titulo = partes[0];
                String artista = partes[1];
                int duracao = Integer.parseInt(partes[2]);
                double preco = Double.parseDouble(partes[3]);
                
                Musica m = new Musica(titulo, artista, duracao, preco);
                listaMusicas.add(m);
            }
        }
        return listaMusicas;
    }
}
