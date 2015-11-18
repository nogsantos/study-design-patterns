
package proposito.criacao.abstractfactory;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since July 2014
 * 
 * PRODUTO CONCRETO
 */
public class OsxButton implements AbstractButton{
    /*
     * Implementacao do metodo abstrato do Produto
     */
    @Override
    public void paint() {
        System.out.println("I'm a Osx Button");
    }
    
}
