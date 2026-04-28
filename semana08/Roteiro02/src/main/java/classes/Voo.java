package classes;

import java.util.ArrayList;
import java.util.List;

public class Voo {
    private String numeroDoVoo;
    private String destino;
    private int capacidadeMaxima;
    private String estadoVoo;
    private List<Passageiro> passageiros;
    private List<String> escalas;

    public Voo(String numeroDoVoo, String destino, int capacidadeMaxima) {
        this.numeroDoVoo = numeroDoVoo;
        this.destino = destino;
        this.capacidadeMaxima = capacidadeMaxima;
        this.estadoVoo = "Aguardando decolagem";
        this.passageiros = new ArrayList<>();
        this.escalas = new ArrayList<>();
    }

    public void adicionarPassageiro(Passageiro p) {
        if (passageiros.size() < capacidadeMaxima) {
            passageiros.add(p);
        } else {
            System.out.println("Voo lotado!");
        }
    }

    public void removerPassageiro(Passageiro p) {
        passageiros.remove(p);
    }

    public void adicionarEscala(String cidade) {
        escalas.add(cidade);
    }

    public void removerEscala(String cidade) {
        escalas.remove(cidade);
    }

    public boolean verificarPrejuizo() {

        return passageiros.size() < 5;
    }

    public String getNumeroDoVoo() {
        return numeroDoVoo;
    }

    public void setNumeroDoVoo(String numeroDoVoo) {
        this.numeroDoVoo = numeroDoVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getEstadoVoo() {
        return estadoVoo;
    }

    public void setEstadoVoo(String estadoVoo) {
        this.estadoVoo = estadoVoo;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public List<String> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<String> escalas) {
        this.escalas = escalas;
    }

    
}
