package listaexercicios0309;

import java.util.ArrayList;

/**
 * Classe que representa uma Publicação com autor, conteúdo e comentários.
 * @author Kassio Dias Monteiro
 */
public class Ex3Publicacao {
    private Ex3Usuario autor;
    private String conteudo;
    private ArrayList<Ex3Comentario> comentarios;

    // Construtor da classe Publicação
    public Ex3Publicacao(Ex3Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.comentarios = new ArrayList<>(); // Inicializa a lista de comentários
    }

    // Método para obter o conteúdo da publicação
    public String getConteudo() {
        return conteudo;
    }

    // Método para obter o autor da publicação
    public Ex3Usuario getAutor() {
        return autor;
    }

    // Método para adicionar um comentário à publicação
    public void adicionarComentario(Ex3Usuario autor, String conteudoComentario) {
        Ex3Comentario novoComentario = new Ex3Comentario(autor, conteudoComentario);
        comentarios.add(novoComentario);
        System.out.println("Comentário adicionado: " + conteudoComentario);
    }

    // Método para listar todos os comentários da publicação
    public void listarComentarios() {
        System.out.println("Comentários na publicação: " + conteudo);
        // Exibe todos os comentários
        for (Ex3Comentario comentario : comentarios) {
            // Exibe o nome do autor do comentário e o conteúdo do comentário
            System.out.println(comentario.getAutor().getNome() + ": " + comentario.getConteudo());
        }
    }
}
