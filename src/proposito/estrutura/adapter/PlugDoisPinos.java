
package proposito.estrutura.adapter;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 31, 2014
 * 
 * Classe Alvo (target) : é o que o CLIENTE possui
 */
public class PlugDoisPinos {
    public void ligarDoisPinos(Tomada t){
        System.out.println("Adaptardor Dois pinos para três pinos...");
    }
}

