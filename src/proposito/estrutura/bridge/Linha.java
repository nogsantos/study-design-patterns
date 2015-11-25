
package proposito.estrutura.bridge;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Nov 25, 2015
 * 
 * Essas são as classes que o cliente enxerga. 
 * Ele quer usar suas funcionalidades, mas a implementação pode variar.
 * 
 */
public class Linha implements Forma{

    private int x;
    private int y;
    /*
     * A abstração da implementação é passada como composição.
     */
    private APIDeDesenho api;

    public Linha(int x, int y, APIDeDesenho api) {
        this.x = x;
        this.y = y;
        this.api = api;
    }

    @Override
    public void desenharLinha() {
        api.desenharLinha(x, y);
    }
}
