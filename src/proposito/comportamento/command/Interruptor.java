
package proposito.comportamento.command;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class Interruptor {
    /*
     * O invoker controla os comandos. 
     * Aqui eles são genéricos, para ser possível variá-los mais tarde
     */
    private Command ligar;
    private Command desligar;

    public Interruptor(Command ligar, Command desligar) {
        this.ligar    = ligar;
        this.desligar = desligar;
    }
    
    public void ligar(){
        ligar.execute();
    }
    
    public void desligar(){
        desligar.execute();
    }
}
