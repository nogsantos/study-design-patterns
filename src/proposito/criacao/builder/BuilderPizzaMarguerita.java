
package proposito.criacao.builder;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 29, 2014
 * 
 * Builder concreto que ira construir diferentes representacoes do produto
 */
public class BuilderPizzaMarguerita  extends PizzaBuilder{

    @Override
    public void buildTempero() {
        pizza.setTempero("Sal e pimenta");
    }

    @Override
    public void buildCobertura() {
        pizza.setCobertura("Marguerita");
    }

}
