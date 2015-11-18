
package proposito.criacao.abstractfactory;



/**
 * @author Fabricio Nogueira - nogsantos
 * @since July 2014
 * 
 * A OsxFactory e uma FABRICA (factory) CONCRETA 
 * que instancia produtos da fabrica abstrata da Familia OSX
 * 
 * E uma factory concreta que implementa ou extende a factory abstrata e 
 * implementa os metodos que serao polimorfados e utilizados em tempo de execucao.
 */
public class OsxFactory implements GuiFactory{
    /*
     * Como e uma fabrica concreta, ela sabe o que ela esta instanciando concretamente. 
     * Nesse caso, esse metodo retorna um PRODUTO da familia OSX OsxButton
     */
    @Override
    public AbstractButton createButton() {
        return new OsxButton();
    }
}
