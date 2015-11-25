
package proposito.estrutura.bridge;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Nov 25, 2015
 */
public class Client {

    public static void main(String[] args) {
        
        Forma [] formas = new Forma[2];
        formas[0]       = new Linha(1, 2, new APIDeDesenhoFormaUm());
        formas[1]       = new Linha(3, 4, new APIDeDesenhoFormaDois());
        
        for (Forma forma : formas) {
            forma.desenharLinha();
        }
    }
}
