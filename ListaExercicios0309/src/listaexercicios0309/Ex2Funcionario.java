//Exercicio 2 - Classe Funcionario.
package listaexercicios0309;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex2Funcionario {
      private String nome;
    private double salario;
    private List<Ex2Projeto> projetos;
    
    public  Ex2Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.projetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void adicionarProjeto(Ex2Projeto projeto) {
        projetos.add(projeto);
    }

    public void exibirProjetos() {
        System.out.println("Projetos do funcionário " + nome + ":");
        for (Ex2Projeto projeto : projetos) {
            System.out.println(projeto.getNome());
        }
    }
}
