
package proposito.estrutura.proxy;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class PessoaDao {
    private static Pessoa Pessoa;

    public static Pessoa getPessoaByName(String nome){
        return Pessoa;
    }
}
