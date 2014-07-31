
package proposito.estrutura.abstraction;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 31, 2014
 * 
 * É possível variar a implementação sem impacto no cliente. 
 */
public class Aplicacao {

    public static void main(String[] args) {
        /*
         * Cria um array de forma geométrica 
         */
        Forma[] objForma = new Forma[2];
        /*
         * São criadas as formas geométricas, e cada uma recebe uma api 
         * de desenho diferente como parametro
         */
        objForma[0]      = new Linha(1, 2, new ApiDesenho1());
        objForma[1]      = new Linha(5, 7, new ApiDesenho2());
        /*
         * No laço, as interações ocorrem e desenha a linha na tela 
         * de acordo com a posição do array no laço. 
         */
        for (Forma objFormaDinamico : objForma) {
            objFormaDinamico.desenharLinha();
        }
    }
}
