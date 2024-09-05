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
        System.out.println("EXERCICIO 1");
        System.out.println(" ");
        Ex1Produto produto1 = new Ex1Produto("Arroz", 1.20, 50);
        Ex1Produto produto2 = new Ex1Produto("Feijão", 0.90, 30);
        Ex1Produto produto3 = new Ex1Produto("Macarrão", 1.50, 20);

        List<Ex1Produto> produtosFornecedorA = new ArrayList<>();
        produtosFornecedorA.add(produto1);
        produtosFornecedorA.add(produto2);
        Ex1Fornecedor fornecedor1 = new Ex1Fornecedor("Fornecedor A", produtosFornecedorA);

        List<Ex1Produto> produtosFornecedorB = new ArrayList<>();
        produtosFornecedorB.add(produto3);
        Ex1Fornecedor fornecedor2 = new Ex1Fornecedor("Fornecedor B", produtosFornecedorB);

        Ex1Estoque estoque = new Ex1Estoque();

        estoque.adicionarProduto(new Ex1Produto("Arroz", 1.20, 50));
        estoque.adicionarProduto(new Ex1Produto("Feijão", 0.90, 30));

        estoque.fazerPedido(fornecedor1, "Arroz", 20);
        estoque.fazerPedido(fornecedor2, "Macarrão", 50);
        
        estoque.listarProdutosEstoqueBaixo(30);
        
        System.out.println("============================================================================================");
        
        System.out.println("EXERCICIO 2");
        System.out.println(" ");
        //Exercicio 2.
        Ex2Projeto projeto1 = new Ex2Projeto("Sistema de Vendas");
        Ex2Projeto projeto2 = new Ex2Projeto("Website da Empresa");

        Ex2Funcionario funcionario1 = new Ex2Funcionario("João", 2000.00);
        Ex2Funcionario funcionario2 = new Ex2Funcionario("Maria", 3000.00);

        funcionario1.adicionarProjeto(projeto1);
        funcionario2.adicionarProjeto(projeto2);

        Ex2Departamento departamentoTI = new Ex2Departamento("Tecnologia da Informação");
        departamentoTI.adicionarFuncionario(funcionario1);
        departamentoTI.adicionarFuncionario(funcionario2);

        funcionario1.exibirProjetos();
        funcionario2.exibirProjetos();

        System.out.println("Média salarial do departamento " + departamentoTI.getNome() + ": " + departamentoTI.calcularMediaSalarial());
        
         System.out.println("============================================================================================");

         System.out.println("EXERCICIO 3");
         System.out.println(" ");
         //Exercicio 3.
        Ex3Usuario autorPublicacao = new Ex3Usuario("João");
        Ex3Usuario usuarioComentario1 = new Ex3Usuario("Maria");
        Ex3Usuario usuarioComentario2 = new Ex3Usuario("Pedro");

        Ex3Publicacao publicacao = new Ex3Publicacao(autorPublicacao, "Hoje é um ótimo dia para programar!");

        publicacao.adicionarComentario(usuarioComentario1, "Concordo plenamente!");
        publicacao.adicionarComentario(usuarioComentario2, "Também estou animado para programar hoje.");

        publicacao.listarComentarios();
        
         System.out.println("============================================================================================");
        
         System.out.println("EXERCICIO 4");
         System.out.println(" ");
        //Exercicio 4.
        Ex4SistemaReservas sistema = new Ex4SistemaReservas();
        Ex4Voos voo1 = new Ex4Voos("TP123", "Lisboa", "Porto", 2);
        Ex4Voos voo2 = new Ex4Voos("TP456", "Lisboa", "Madrid", 1);
        sistema.adicionarVoo(voo1);
        sistema.adicionarVoo(voo2);

        Ex4Passageiros p1 = new Ex4Passageiros("João Silva", "001");
        Ex4Passageiros p2 = new Ex4Passageiros("Maria Santos", "002");

        sistema.reservarVoo(p1, "TP123");
        sistema.reservarVoo(p2, "TP123");
        sistema.reservarVoo(p1, "TP456");
        sistema.reservarVoo(p2, "TP456"); 

        sistema.listarReservasPassageiro(p1);
        sistema.listarReservasPassageiro(p2);
        
        System.out.println("============================================================================================");
        
        System.out.println("EXERCICIO 5");
        System.out.println(" ");
        //Exercicio 5.
        Ex5Medico medico1 = new Ex5Medico(1, "Roberto");
        Ex5Medico medico2 = new Ex5Medico(2, "Carlos");

        Ex5Paciente paciente1 = new Ex5Paciente(1, "José");
        Ex5Paciente paciente2 = new Ex5Paciente(2, "Ricardo");

        medico1.agendarConsulta("2024-19-11", paciente1);
        medico1.agendarConsulta("2024-10-22", paciente2);
        medico2.agendarConsulta("2024-11-13", paciente2);

        medico1.listarPacientes();
        medico2.listarPacientes();

        paciente1.listarConsultas();
        paciente2.listarConsultas();
    }    
}
