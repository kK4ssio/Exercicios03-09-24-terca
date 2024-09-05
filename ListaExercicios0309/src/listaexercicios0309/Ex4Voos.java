//Exercicio 4 - Classe Voos
package listaexercicios0309;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex4Voos {
    private String numeroVoo;
    private String origem;
    private String destino;
    private int capacidade;
    private List<Ex4Reservas> reservas;

    public Ex4Voos(String numeroVoo, String origem, String destino, int capacidade) {
        this.numeroVoo = numeroVoo;
        this.origem = origem;
        this.destino = destino;
        this.capacidade = capacidade;
        this.reservas = new ArrayList<>();
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public boolean verificarDisponibilidade() {
        return reservas.size() < capacidade;
    }

    public void adicionarReserva(Ex4Reservas reserva) {
        if (verificarDisponibilidade()) {
            reservas.add(reserva);
        } else {
            System.out.println("Voo lotado! Não é possível fazer mais reservas.");
        }
    }

    public List<Ex4Reservas> getReservas() {
        return reservas;
    }
}
