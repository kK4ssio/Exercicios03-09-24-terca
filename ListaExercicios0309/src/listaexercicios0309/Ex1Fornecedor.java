//Exercicio 1 - Classe Fornecedor.
package listaexercicios0309;

    import java.util.ArrayList;
    import java.util.List;

/**
 * @author Kassio Dias Monteiro
 */
public class Ex1Fornecedor {

    String nome;
    List<Ex1Produto> produtos;

    public Ex1Fornecedor(String nome, List<Ex1Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;

    }

    Ex1Produto fornecerProduto(String nomeProduto, int quantidade) {
        for (Ex1Produto produto : produtos) {
            if (produto.nome.equals(nomeProduto)) {
                return new Ex1Produto(produto.nome, produto.preco, quantidade);
            }
        }
        return null;
    }
}
