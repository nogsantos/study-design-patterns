
package proposito.criacao.builder;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 29, 2014
 * 
 * Builder abstrato pode ser classe abstrata ou interface.
 */
abstract class PizzaBuilder {
    protected Pizza pizza;
    
    public Pizza getPizza(){
        return pizza;
    }
    
    public void criarNovoProdutoPizza(){
        pizza = new Pizza();
    }
    
    public abstract void buildTempero();
    public abstract void buildCobertura();

}
