//Exercicio 1 - Classe Estoque.
package listaexercicios0309;

    import java.util.ArrayList;
    import java.util.List;

/**
 * @author Kassio Dias Monteiro
 */
public class Ex1Estoque {

    List<Ex1Produto> produtos;

    public Ex1Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Ex1Produto produto) {
        for (Ex1Produto p : produtos) {
            if (p.nome.equals(produto.nome)) {
                p.adicionarQuantidade(produto.quantidade);
                System.out.println("Adicionado ao estoque: " + p);
                return;
            }
        }
        produtos.add(produto);
        System.out.println("Adicionado ao estoque: " + produto);
    }

    public void fazerPedido(Ex1Fornecedor fornecedor, String nomeProduto, int quantidade) {
        Ex1Produto produtoFornecido = fornecedor.fornecerProduto(nomeProduto, quantidade);
        if (produtoFornecido != null) {
            adicionarProduto(produtoFornecido);
            System.out.println("Pedido de " + quantidade + "x " + nomeProduto + " ao fornecedor " + fornecedor.nome + " foi realizado com sucesso.");
        } else {
            System.out.println("Produto '" + nomeProduto + "' não disponível com o fornecedor " + fornecedor.nome + ".");
        }
    }
    
    public  void listarProdutosEstoqueBaixo(int limite) {
        System.out.println("Produtos com estoque baixo:");
        for (Ex1Produto produto : produtos) {
            if (produto.quantidade < limite) {
                System.out.println(produto);
            }
        }
    }
}
