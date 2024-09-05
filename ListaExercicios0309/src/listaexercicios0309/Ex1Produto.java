//Exercicio 1 - Classe Produto
package listaexercicios0309;
    import java.util.ArrayList;
    import java.util.List;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex1Produto {

    String nome;
    double preco;
    int quantidade;

    public Ex1Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: €" + preco + ", Quantidade: " + quantidade;
    }
}
