//Lista de Exercicios 03/09/2024 - Terça-Feira.
package listaexercicios0309;
    import java.util.ArrayList;
    import java.util.List;
/**
 * @author Kassio Dias Monteiro
 */
public class ListaExercicios0309 {
    public static void main(String[] args) {
        //Exercicio 1.
           // Criação de produtos
        Ex1Produto produto1 = new Ex1Produto("Arroz", 1.20, 50);
        Ex1Produto produto2 = new Ex1Produto("Feijão", 0.90, 30);
        Ex1Produto produto3 = new Ex1Produto("Macarrão", 1.50, 20);

        // Criação de fornecedores
        List<Ex1Produto> produtosFornecedorA = new ArrayList<>();
        produtosFornecedorA.add(produto1);
        produtosFornecedorA.add(produto2);
        Ex1Fornecedor fornecedor1 = new Ex1Fornecedor("Fornecedor A", produtosFornecedorA);

        List<Ex1Produto> produtosFornecedorB = new ArrayList<>();
        produtosFornecedorB.add(produto3);
        Ex1Fornecedor fornecedor2 = new Ex1Fornecedor("Fornecedor B", produtosFornecedorB);

        // Criação de estoque
        Ex1Estoque estoque = new Ex1Estoque();

        // Adicionando produtos ao estoque
        estoque.adicionarProduto(new Ex1Produto("Arroz", 1.20, 50));
        estoque.adicionarProduto(new Ex1Produto("Feijão", 0.90, 30));

        // Fazendo pedidos a fornecedores
        estoque.fazerPedido(fornecedor1, "Arroz", 20);
        estoque.fazerPedido(fornecedor2, "Macarrão", 50);

        // Listando produtos com estoque baixo
        estoque.listarProdutosEstoqueBaixo(30);
        
        System.out.println("============================================================================================");
        
        //Exercicio 2.
         // Criar alguns projetos
        Ex2Projeto projeto1 = new Ex2Projeto("Sistema de Vendas");
        Ex2Projeto projeto2 = new Ex2Projeto("Website da Empresa");

        // Criar alguns funcionários
        Ex2Funcionario funcionario1 = new Ex2Funcionario("João", 2000.00);
        Ex2Funcionario funcionario2 = new Ex2Funcionario("Maria", 3000.00);

        // Atribuir projetos aos funcionários
        funcionario1.adicionarProjeto(projeto1);
        funcionario2.adicionarProjeto(projeto2);

        // Criar um departamento e adicionar funcionários
        Ex2Departamento departamentoTI = new Ex2Departamento("Tecnologia da Informação");
        departamentoTI.adicionarFuncionario(funcionario1);
        departamentoTI.adicionarFuncionario(funcionario2);

        // Exibir projetos dos funcionários
        funcionario1.exibirProjetos();
        funcionario2.exibirProjetos();

        // Calcular e exibir a média salarial do departamento
        System.out.println("Média salarial do departamento " + departamentoTI.getNome() + ": " + departamentoTI.calcularMediaSalarial());
    }
    
}
