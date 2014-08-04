
package proposito.comportamento.state;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Estado concreto 2
 */
public class TcpClosed implements TcpState{

    @Override
    public void open(TcpConnection conn) {
        /*
         * Lógica para tratar uma requisição de OPEN quando a conexão
         * está fechada
         */
    }

    @Override
    public void close(TcpConnection conn) {
        /*
         * Lógica para tratar uma requisição de CLOSE quando a conexão
         * está fechada
         */
    }

}
