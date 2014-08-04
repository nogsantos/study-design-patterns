
package proposito.estrutura.flyweight;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class Contexto {

    /*
     * O cliente fornece o contexto
     */
    private int linha;
    private int coluna;

    public Contexto(int linha, int coluna) {
        this.linha  = linha;
        this.coluna = coluna;
    }
}
