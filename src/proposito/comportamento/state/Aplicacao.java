
package proposito.comportamento.state;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class Aplicacao {

    public static void main(String[] args) {
        /*
         * Criando o objeto de contexto
         */
        TcpConnection conn = new TcpConnection();
        /*
         * Configurando o objeto para o estado close
         */
        TcpState stateClosed = new TcpClosed();
        conn.setState(stateClosed);
        /*
         * Requisitando um comportamento do objeto
         */
        conn.open();
        /*
         * Mudando o estado do objeto
         */
        TcpState stateEstabilished = new TcpStablished();
        conn.setState(stateEstabilished);
        /*
         * Chamando o mesmo comportamento, mas o tratamento será diferente.
         */
        conn.open();
    }
}
