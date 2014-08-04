
package proposito.estrutura.decorator;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class DecoradorBarraVertical extends JanelaDecorator{

    public DecoradorBarraVertical(Janela janelaDecorada) {
        super(janelaDecorada);
    }

    @Override
    public void draw(){
        drawBarraVertical();
        janelaDecorada.draw();
    }
    /**
     * O decorator adiciona novos elementos
     */
    private void drawBarraVertical(){}
}
