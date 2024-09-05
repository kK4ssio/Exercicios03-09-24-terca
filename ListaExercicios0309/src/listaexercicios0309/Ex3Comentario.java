//Exercicio 3 - Classe Comentario.
package listaexercicios0309;

import java.util.ArrayList;
/**
 * @author Kassio Dias Monteiro
 */
public class Ex3Comentario {
    private Ex3Usuario autor;
    private String conteudo;
    
    public Ex3Comentario(Ex3Usuario autor, String conteudo) {
        this.autor = autor;
        this.conteudo = conteudo;
    }
    
    public Ex3Usuario getAutor() {
        return autor;
    }
    
    public String getConteudo() {
        return conteudo;
    }
}
