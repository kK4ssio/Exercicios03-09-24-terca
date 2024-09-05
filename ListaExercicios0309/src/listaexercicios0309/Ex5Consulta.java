//Exercicio 5 - Classe Consulta
package listaexercicios0309;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kassio Dias Monteiro
 */
public class Ex5Consulta {
     private String data;
    private Ex5Medico medico;
    private Ex5Paciente paciente;

    public Ex5Consulta(String data, Ex5Medico medico, Ex5Paciente paciente) {
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getData() {
        return data;
    }

    public Ex5Medico getMedico() {
        return medico;
    }

    public Ex5Paciente getPaciente() {
        return paciente;
    }

    @Override
    public String toString() {
        return "Consulta com Dr. " + medico.getNome() + " no dia " + data + " para o paciente " + paciente.getNome();
    }
}
