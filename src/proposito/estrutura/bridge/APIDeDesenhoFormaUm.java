
package proposito.estrutura.bridge;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Nov 25, 2015
 */
public class APIDeDesenhoFormaUm implements APIDeDesenho{

    @Override
    public void desenharLinha(int x, int y) {
        System.out.println("Implementando a forma UM do desenho da linha pontos: x= "+x+" y= "+y);
    }
}
