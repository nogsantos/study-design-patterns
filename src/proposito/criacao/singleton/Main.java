
package proposito.criacao.singleton;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Nov 18, 2015
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Executando o padrão. Única chamada para o objeto.
         */
        Singleton.getInstance().message();
        Singleton.getInstance().separador();
        Singleton.getInstance().messageDois();
        Singleton.getInstance().separador();
        Singleton.getInstance().setMessage("Parâmetro");
        Singleton.getInstance().messageTres();
        
    }
}
