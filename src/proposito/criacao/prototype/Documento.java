
package proposito.criacao.prototype;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * Protótipo abstrato
 */
public class Documento implements Cloneable{
    /*
     * Implementação padrão para clonagem de objetos.
     */
    @Override
    protected Documento clone() throws CloneNotSupportedException{
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
        }
        return (Documento) clone;
    }
}
