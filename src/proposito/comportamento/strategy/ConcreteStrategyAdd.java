
package proposito.comportamento.strategy;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class ConcreteStrategyAdd implements Strategy{

    @Override
    public int execute(int a, int b) {
        return a + b;
    }

}
