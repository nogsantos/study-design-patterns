
package proposito.comportamento.command;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Command concreto
 */
public class CommandAcender implements Command{

    private Luz objLuz;
    
    public CommandAcender(Luz luz){
        this.objLuz = luz;
    }
    
    @Override
    public void execute() {
        objLuz.acender();
    }

}
