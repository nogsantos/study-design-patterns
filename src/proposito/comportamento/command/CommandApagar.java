
package proposito.comportamento.command;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class CommandApagar implements Command{

    private Luz objLuz;
    
    public CommandApagar(Luz luz){
        this.objLuz = luz;
    }
    
    @Override
    public void execute() {
        objLuz.apagar();
    }
}
