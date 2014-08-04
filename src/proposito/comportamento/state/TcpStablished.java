
package proposito.comportamento.state;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Estado concreto 01
 */
public class TcpStablished implements TcpState{

    @Override
    public void open(TcpConnection conn) {
        /*
         * Lógica para tratar uma requisição de OPEN quando uma conexão já
         * foi estabelecida.
         */
    }

    @Override
    public void close(TcpConnection conn) {
        /*
         * Lógica para tratar uma requisição de CLOSE quando uma conexão já
         * foi estabelecida.
         */
    }

}
