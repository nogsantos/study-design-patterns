
package proposito.comportamento.state;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Classe de contexto 
 * 
 * Vai mudar o comportamento de acordo com o seu estado
 */
public class TcpConnection {

    private TcpState state;
    
    public void setState(TcpState state){
        this.state = state;
    }
    
    public TcpState getState(){
        return this.state;
    }
    
    public void open(){
        state.open(this);
    }
    
    public void close(){
        state.close(this);
    }
}
