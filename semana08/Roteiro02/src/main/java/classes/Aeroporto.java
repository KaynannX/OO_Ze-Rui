package classes;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
    private String nome;
    private String localizacao;
    private List<Voo> voos;

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.voos = new ArrayList<>();
    }

    public void adicionarVoo(Voo v) {
        voos.add(v);
    }

    public void removerVoo(Voo v) {
        voos.remove(v);
    }

    public void listarVoos() {
        System.out.println("--- Lista de Voos em " + nome + " ---");
        for (Voo v : voos) {
            System.out.println("Voo: " + v.getNumeroDoVoo() + " | Destino: " + v.getDestino());
        }
    }

    public List<Voo> calcularVoosComPrejuizo() {
        List<Voo> comPrejuizo = new ArrayList<>();
        for (Voo v : voos) {
            if (v.verificarPrejuizo()) {
                comPrejuizo.add(v);
            }
        }
        return comPrejuizo;
    }

    public void iniciarVoo(String numeroVoo) {
        for (Voo v : voos) {
            if (v.getNumeroDoVoo().equals(numeroVoo)) {
                v.setEstadoVoo("Voando");
                System.out.println("O voo " + numeroVoo + " decolou!");
                return;
            }
        }
        System.out.println("Voo nao encontrado.");
    }
}
