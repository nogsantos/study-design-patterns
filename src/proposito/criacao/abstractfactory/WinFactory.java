
package proposito.criacao.abstractfactory;

import java.awt.Button;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since July 2014
 * 
 * A WinFactory e uma FABRICA (factory) CONCRETA 
 * que instancia produtos da fabrica abstrata da familia WIN
 * 
 * E uma factory concreta que implementa ou extende a factory abstrata e 
 * implementa os metodos que serao polimorfados e utilizados em tempo de execucao.
 */
public class WinFactory implements GuiFactory{
    /*
     * Como e uma fabrica concreta, ela sabe o que ela esta instanciando concretamente. 
     * Nesse caso, esse metodo retorna um PRODUTO da familia WIN WinButton
     */
    @Override
    public Button createButton() {
        return new WinButton();
    }
    
}
