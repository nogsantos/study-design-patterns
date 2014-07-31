
package proposito.estrutura.abstraction;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 31, 2014
 * 
 * Essas são as classes que o cliente enxerga. Ele quer usar suas funcionalidades
 * mas a implementação pode variar.
 */
public class Linha implements Forma{
    /*
     * Parametro do tipo ApiDeDesenho, note como a abstração de implementação
     * é passada para cá.
     */
    private ApiDeDesenho api;
    private int y;
    private int x;
    /*
     * Construtor
     */
    public Linha(int x, int y, ApiDeDesenho api){
        this.x   = x;
        this.y   = y;
        this.api = api;
    }
    /*
     * Desenha a linha na tela
     */
    @Override
    public void desenharLinha() {
        api.desenharLinha(x, y);
    }

}
