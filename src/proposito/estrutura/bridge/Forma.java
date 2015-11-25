
package proposito.estrutura.bridge;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Nov 25, 2015
 * 
 * Bridge
 * Desacopla uma interface de sua implementação, de forma que elas possa variar 
 * independentemente
 * 
 * Use o Bridge quando:
 *  - Você quer evitar um vínculo entre a abstração e a implementação
 *  - Mudanças na implementação de uma abstração não deveriam ter impacto nos 
 *  clientes, isto é, seu código não deveria ser recompilado
 * 
 */
public interface Forma {

    public void desenharLinha();
    
}
