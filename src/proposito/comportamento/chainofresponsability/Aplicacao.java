
package proposito.comportamento.chainofresponsability;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class Aplicacao {

    public static void main(String[] args) {
        Janela j1 = null, j2 = null, j3 = null;
        Botao b1  = null;
        /*
         * Se b1 tive aquele Help ele mesmo trata
         * se não, passa para j3 tratar, que pode passar para j2, que pode passar
         * para j1 e assim por diante até um Handler "default" trata a requisição.
         *
         */
        b1 = new Botao(j3);
        j3 = new Janela(j2);
        j2 = new Janela(j1);
        /*
         * O usuário clica na ajuda do botão. 
         */
        b1.handlerHelp();
        
    }
}
