
package proposito.criacao.abstractfactory;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since July 2014
 * 
 * PRODUTO ABSTRATO
 * Os produtos, no padrao object factory, sao os objetos que se deseja criar.
 * Podem ser dezenas de produtos em uma situacao real.
 */
public interface AbstractButton {
    /*
     * Um metodo abstrado para pintar qualquer coisa na tela.
     */
    public void paint();
}
