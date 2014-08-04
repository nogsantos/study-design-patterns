
package proposito.estrutura.decorator;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class Aplicacao {
    
    public static void main(String[] args) {
        
        Janela janelaDecorada = new DecoradorBarraVertical(new JanelaSimples());
        /*
         * combina o comportamento base mais o comportamento "decorado"
         */
        janelaDecorada.draw();
        
    }
    
}
