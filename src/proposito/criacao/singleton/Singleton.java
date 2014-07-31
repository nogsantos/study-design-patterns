
package proposito.criacao.singleton;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 31, 2014
 */
public class Singleton {
    /*
     * Constante
     * Instância constante da própria classe.
     * O modificador private quer dizer que esta instância só pode ser acessada
     * por essa classe a saída fica por conta do metodo getInstance()
     */
    private static final Singleton INSTANCE = new Singleton();
    /*
     * Construtor
     * O construtor privado impede que outras classes o acesse diretamente.
     * Isso quer dizer que essa classe não pode ser instanciada
     */
    private Singleton(){}
    /*
     * Unico modo de acessar a instancia singleton da classe.
     * Esse é um ponto de acesso conhecido, controlado e global
     */
    public static Singleton getInstance(){
        return INSTANCE;
    }
    
}
