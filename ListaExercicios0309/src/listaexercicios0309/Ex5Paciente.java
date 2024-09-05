//Exercicio 5 - Classe Paciente.
package listaexercicios0309;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex5Paciente {
     private int id;
    private String nome;
    private List<Ex5Consulta> consultas;

    public Ex5Paciente(int id, String nome) {
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

    public void agendarConsulta(Ex5Consulta consulta) {
        consultas.add(consulta);
    }

    public void listarConsultas() {
        if (consultas.isEmpty()) {
            System.out.println("O paciente " + nome + " não tem consultas agendadas.");
        } else {
            System.out.println("Consultas do paciente " + nome + ":");
            for (Ex5Consulta consulta : consultas) {
                System.out.println(consulta);
            }
        }
    }
}
