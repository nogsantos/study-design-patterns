
package proposito.criacao.abstractfactory;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since July 2014
 * 
 * A GuiFactory é uma FABRICA (factory) ABSTRATA
 * pode ser uma classe ou interface
 * 
 * Atraves dela sera possivel, em tempo de execucao, 
 * criar metodos que por polimorfismo, atraves de parametros podem ser 
 * instanciados dinamicamente. 
 */
public interface GuiFactory {
    /*
     * Metodo generico para criar botao
     */
    public AbstractButton createButton();
}
