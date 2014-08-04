
package proposito.comportamento.state;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Estado Genérico
 */
public interface TcpState {

    void open(TcpConnection conn);
    void close(TcpConnection conn);
}
