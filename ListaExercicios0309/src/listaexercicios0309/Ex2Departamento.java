//Exercicio 2 - Classe Departamento.
package listaexercicios0309;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kassio Dias Monteiro
 */
public class Ex2Departamento {
     private String nome;
    private List<Ex2Funcionario> funcionarios;

    public Ex2Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Ex2Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            return 0.0;
        }
        double somaSalarios = 0;
        for (Ex2Funcionario funcionario : funcionarios) {
            somaSalarios += funcionario.getSalario();
        }
        return somaSalarios / funcionarios.size();
    }

    public String getNome() {
        return nome;
    }
}
