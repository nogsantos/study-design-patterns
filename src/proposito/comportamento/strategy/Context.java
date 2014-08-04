
package proposito.comportamento.strategy;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class Context {

    private Strategy objStrategy;

    public Context(Strategy varObjStrategy) {
        this.objStrategy = varObjStrategy;
    }
    
    public int executeStrategy(int a, int b){
        return objStrategy.execute(a, b);
    }
}
