
package proposito.criacao.builder;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 29, 2014
 * 
 * Builder
 * 
 * Separa a construção de um objeto complexo da sua representação, de forma 
 * que o mesmo processo possa criar diferentes tipos de representações
 * 
 * Use Builder quando:
 *  O algoritmo para criar um objeto deve ser independente de suas 
 *  partes e de como elas são montadas
 */
public class Execucao {
    public static void main(String[] args) {
        /*
         * Instacia o director
         */
        Cozinhar objCozinhar = new Cozinhar();
        /*
         * Instancia os builders concretos
         * Na vida real esse builders deveriam ser criados dinamicamente de 
         * webservices, parametros, arquivos etc.
         */
        PizzaBuilder builderPizzaMarguerita = new BuilderPizzaMarguerita();
        PizzaBuilder builderPizzaCalabresa  = new BuilderPizzaCalabresa();
        /*
         * Seta o builder na classe diretora
         */
        objCozinhar.setPizzaBuilder(builderPizzaMarguerita);
        /*
         * Constroi as partes 
         */
        objCozinhar.construirPizza();
        /*
         * Retorna o objeto construido
         */
        Pizza objeMarguerita = objCozinhar.getPizza();
        System.out.println(objeMarguerita.finalizaPizza()); 
        
        /*
         * Utilizando o mesmo objeto, construir e chamado independente do builder
         * que foi passado para a classe diretora. Nao e necessario alterar o codigo
         * e sempre o mesmo algoritmo.
         */
        objCozinhar.setPizzaBuilder(builderPizzaCalabresa);
        objCozinhar.construirPizza();
        
        Pizza objeCalabresa = objCozinhar.getPizza();
        System.out.println(objeCalabresa.finalizaPizza()); 
    }
}
