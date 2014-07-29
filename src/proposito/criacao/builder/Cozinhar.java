
package proposito.criacao.builder;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 29, 2014
 * 
 * Classe DIRECTOR (Diretora) 
 * Coorderna e gerencia a order de construcao das partes
 */
public class Cozinhar {
    /*
     * Pode possuir de 1..n builders porque possui uma agregacao de builders
     */
    private PizzaBuilder pizzabuilder;
    /*
     * Setar diferentes buildes de acordo com a necessidade
     */
    public void setPizzaBuilder(PizzaBuilder pb){
        pizzabuilder = pb;
    }
    /*
     * O cliente pode recuperar a pizza 
     */
    public Pizza getPizza(){
        return pizzabuilder.getPizza();
    }
    /*
     * Construcao da pizza
     * Na construcao chama-se os metodos de construcao do objeto parte a parte e passo a passo. 
     *
     * O construtor esta construindo as partes dos objetos que foram passadas
     * para os builders
     */
    public void construirPizza(){
        pizzabuilder.criarNovoProdutoPizza();
        pizzabuilder.buildTempero();
        pizzabuilder.buildCobertura();
    }
}
