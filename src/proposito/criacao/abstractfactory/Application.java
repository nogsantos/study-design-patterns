
package proposito.criacao.abstractfactory;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since July 2014
 *
 * Na aplicacao em execucao, o programa recebe uma factory
 */
public class Application {
    /*
     * Construtor
     * Na execucao do programa ele recebe uma FACTORY ABSTRATA, não as concretas, 
     * porque voce quer por polimorfismo, em tempo de execucao, o parametro ser passado 
     * da factory correta, mas em tempo de compilacao, de escrita do codigo voce não sabe
     * e eh por isso que se usa a factory abstrata
     */
    Application(GuiFactory factory){
        /*
         * Instanciacao do objeto PRODUTO
         * Nesse momento tudo eh abstrato, nao se sabe qual botao esta 
         * instanciando e tambem nao se sabe qual factory esta sendo chamada em 
         * tempo de compilacao so se sabe em tempo de execucao 
         */
        Button button = factory.createButton();
        /*
         * Metodos chamados
         */
        button.paint();
    }
}
