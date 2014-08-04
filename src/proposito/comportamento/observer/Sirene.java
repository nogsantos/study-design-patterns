
package proposito.comportamento.observer;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Notificador Abstrato
 */
public interface Sirene {

    public void adicionarObservador(Operario o);
    public void removerObservador(Operario o);
}
