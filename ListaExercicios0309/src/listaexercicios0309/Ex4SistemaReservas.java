package listaexercicios0309;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex4SistemaReservas {
     private List<Ex4Voos> voos;
    private List<Ex4Reservas> reservas;

    public Ex4SistemaReservas() {
        voos = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void adicionarVoo(Ex4Voos voo) {
        voos.add(voo);
    }

    public void reservarVoo(Ex4Passageiros passageiro, String numeroVoo) {
        for (Ex4Voos voo : voos) {
            if (voo.getNumeroVoo().equals(numeroVoo)) {
                if (voo.verificarDisponibilidade()) {
                    Ex4Reservas reserva = new Ex4Reservas(passageiro, voo);
                    voo.adicionarReserva(reserva);
                    reservas.add(reserva);
                    System.out.println("Reserva feita com sucesso para " + passageiro.getNome() + " no voo " + numeroVoo);
                } else {
                    System.out.println("Não foi possível fazer a reserva. O voo está lotado.");
                }
                return;
            }
        }
        System.out.println("Voo não encontrado.");
    }

    public void listarReservasPassageiro(Ex4Passageiros passageiro) {
        System.out.println("Reservas de " + passageiro.getNome() + ":");
        for (Ex4Reservas reserva : reservas) {
            if (reserva.getPassageiro().getId().equals(passageiro.getId())) {
                System.out.println("Voo " + reserva.getVoo().getNumeroVoo() + " - " + reserva.getVoo().getOrigem() + " para " + reserva.getVoo().getDestino());
            }
        }
    }
}
