
package proposito.estrutura.adapter;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 31, 2014
 * 
 * Classe adaptada (adaptee) : é o que o CLIENTE necessita.
 */
public class PlugTresPinos {
    public void ligarTresPinos(Tomada t){
        System.out.println("Adaptador Tres pinos para dois pinos");
    }
}
