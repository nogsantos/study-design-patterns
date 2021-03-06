
package proposito.comportamento.chainofresponsability;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Handler concreto
 */
public class Janela implements HelpHandler{

    private boolean temHelp;
    /*
     * Handler concreto
     */
    private HelpHandler helpSuccessor;

    public Janela(HelpHandler helpSuccessor) {
        this.helpSuccessor = helpSuccessor;
    }
    
    @Override
    public void handlerHelp() {
        if (temHelp) {
            // Código de tratamento do help
        }else{
            helpSuccessor.handlerHelp();
        }
    }

}
