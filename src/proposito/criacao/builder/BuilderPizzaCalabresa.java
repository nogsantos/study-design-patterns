
package proposito.criacao.builder;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 29, 2014
 */
public class BuilderPizzaCalabresa extends PizzaBuilder{

    @Override
    public void buildTempero() {
        pizza.setTempero("Sal e farinha de trigo");
    }

    @Override
    public void buildCobertura() {
        pizza.setCobertura("Queijo e calabresa");
    }

}
