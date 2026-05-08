package classes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.ArrayList;

public class JSONServiceMusica {

    public String musicasToJSON(List<Musica> musicas) {
        try {
            ObjectMapper mapper = new ObjectMapper();						
            return mapper.writeValueAsString(musicas);
        } catch (Exception e) {
            e.printStackTrace();
            return "[]";
        }
    }

    public List<Musica> JSONToMusicas(String jsonString) {
        try {
            if (jsonString == null || jsonString.isEmpty()) return new ArrayList<>();
            
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonString, new TypeReference<List<Musica>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }   
}