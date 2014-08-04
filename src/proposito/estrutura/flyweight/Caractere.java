
package proposito.estrutura.flyweight;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Objeto Flyweight
 */
public class Caractere {
    static int MAX_VALUE;

    private char caractere;

    public Caractere(char caractere) {
        this.caractere = caractere;
    }
    
    public void desenharNaTela(Contexto c){
        /*
         * Lógica para desenhar o caractere na tela
         * de acordo com o contexto fornecido pelo cliente
         */
    }
}
