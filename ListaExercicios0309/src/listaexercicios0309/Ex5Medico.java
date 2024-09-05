//Exercicio 5 - Classe Médico
package listaexercicios0309;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex5Medico {
     private int id;
    private String nome;
    private List<Ex5Consulta> consultas;

    public Ex5Medico(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.consultas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void agendarConsulta(String data, Ex5Paciente paciente) {
        Ex5Consulta consulta = new Ex5Consulta(data, this, paciente);
        consultas.add(consulta);
        paciente.agendarConsulta(consulta);
        System.out.println("Consulta agendada para  " + paciente.getNome() + " com Dr. " + nome + " no dia " + data + ".");
    }

    public void listarPacientes() {
        if (consultas.isEmpty()) {
            System.out.println("O Dr. " + nome + " não tem consultas agendadas.");
        } else {
            System.out.println("Pacientes atendidos pelo Dr. " + nome + ":");
            for (Ex5Consulta consulta : consultas) {
                System.out.println(consulta.getPaciente().getNome());
            }
        }
    }

  
}
