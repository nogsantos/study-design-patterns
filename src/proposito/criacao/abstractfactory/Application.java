
package proposito.criacao.abstractfactory;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since July 2014
 *
 * Na aplicacao em execucao, o programa recebe uma factory
 * 
 * Proporciona uma interface para criar famílias de objetos relacionados 
 * ou dependentes sem especificar suas classes concretas.
 * Usar quando:
 * O sistema deve ser configurado com uma de múltiplas famílias de produtos. 
 * Estes produtos relacionados são projetados para serem utilizados juntos,
 * e você quer garantir essa restrição.
 *
 * Ps.: Enquanto abstract factory enfatiza famílias de objetos relacionados, 
 * builder constrói partes desse objeto passo a passo. 
 *
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
        AbstractButton button = factory.createButton();
        /*
         * Metodos chamados
         */
        button.paint();
    }
}
