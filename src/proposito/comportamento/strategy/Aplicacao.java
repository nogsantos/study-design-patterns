
package proposito.comportamento.strategy;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Diferentes variações de algoritmos, apenas configurando a estratégia, 
 * sem a necessidade de estruturas de seleção. 
 */
public class Aplicacao {

    public static void main(String[] args) {
        Context objContext;
        
        objContext  = new Context(new ConcreteStrategyAdd());
        int resultA = objContext.executeStrategy(3, 4);
        
        objContext  = new Context(new ConcreteStrategySubtract());
        int resultB = objContext.executeStrategy(3, 4);
                
    }
}
