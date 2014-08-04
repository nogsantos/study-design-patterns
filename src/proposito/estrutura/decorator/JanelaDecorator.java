
package proposito.estrutura.decorator;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class JanelaDecorator extends Janela{

    protected Janela janelaDecorada;
    
    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public JanelaDecorator(Janela janelaDecorada){
        this.janelaDecorada = janelaDecorada;
    }

}
