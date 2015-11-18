
package proposito.criacao.singleton;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Nov 18, 2015
 * 
 * Singleton
 * 
 * Garante que uma classe tem apenas uma instância e provê um ponto de acesso 
 * global a ela.
 * 
 * Use Singleton quando:
 *  Deve haver exatamente uma instância de uma classe, e ela deve ser 
 *  acessível aos clientes a partir de um ponto de acesso conhecido.
 * 
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
