//Exercicio 4 - Classe Reservas
package listaexercicios0309;

/**
 * @author Kassio Dias Monteiro
 */
public class Ex4Reservas {
    private Ex4Passageiros passageiro;
    private Ex4Voos voo;

    public Ex4Reservas(Ex4Passageiros passageiro, Ex4Voos voo) {
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public Ex4Passageiros getPassageiro() {
        return passageiro;
    }

    public Ex4Voos getVoo() {
        return voo;
    }
}
