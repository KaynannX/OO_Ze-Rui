package classes;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FilePersistence {

    public void saveToFile(String conteudo, String filePath) {
        try (FileWriter writer = new FileWriter(new File(filePath))) {
            writer.write(conteudo);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String loadFromFile(String filePath) {
        StringBuilder conteudo = new StringBuilder();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            scanner.useDelimiter("\\Z"); 
            if (scanner.hasNext()) {
                conteudo.append(scanner.next());
            }
        } catch (Exception e) {
            System.err.println("Arquivo nao encontrado.");
        }
        return conteudo.toString();
    }
}