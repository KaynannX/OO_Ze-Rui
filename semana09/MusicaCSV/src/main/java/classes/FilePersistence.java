package classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePersistence {
    
    public void salvar(String caminho, String conteudo) {
        try {
            PrintWriter gravador = new PrintWriter(caminho);
            gravador.print(conteudo);
            gravador.close();
            System.out.println("Arquivo salvo com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Nao foi possivel criar o arquivo.");
        }
    }

    public String carregar(String caminho) {
        String conteudoAcumulado = "";
        try {
            File arquivo = new File(caminho);
            Scanner leitor = new Scanner(arquivo);
            
            while (leitor.hasNextLine()) {
                conteudoAcumulado = conteudoAcumulado + leitor.nextLine() + "\n";
            }
            leitor.close();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: Arquivo nao encontrado.");
        }
        return conteudoAcumulado;
    }
}