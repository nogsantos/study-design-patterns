
package proposito.estrutura.flyweight;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class Factory {

    /*
     * Gerencia a pool, a "cache" de flyweights
     */
    private Caractere[] pool;

    public Factory(int max) {
        this.pool =  new Caractere[max];
    }
    
    public Caractere getCaractere(char c){
        if (pool[c] == null) {
            pool[c] = new Caractere(c);
        }
        return pool[c];
    }
    
    
}
