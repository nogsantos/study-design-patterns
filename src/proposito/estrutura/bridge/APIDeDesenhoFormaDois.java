
package proposito.estrutura.bridge;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Nov 25, 2015
 */
public class APIDeDesenhoFormaDois implements APIDeDesenho{

    @Override
    public void desenharLinha(int x, int y) {
        System.out.println("Implementando a forma DOIS do desenho da linha pontos: x= "+x+" y= "+y);
    }
}
