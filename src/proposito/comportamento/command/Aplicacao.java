
package proposito.comportamento.command;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class Aplicacao {

    public static void main(String[] args) {
        Luz objLuz         = new Luz();
        Command objAcender = new CommandAcender(objLuz);
        Command objApagar  = new CommandApagar(objLuz);
        
        Interruptor objeInterruptor = new Interruptor(objApagar, objApagar);
        
        if (args[0].equalsIgnoreCase("on")) {
            objeInterruptor.ligar();
        }else if(args[0].equalsIgnoreCase("off")){
            objeInterruptor.desligar();
        }
    }
}
