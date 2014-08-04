
package proposito.estrutura.proxy;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Objeto real
 */
public class PessoaImp implements Pessoa{
    
    private String nome;

    public PessoaImp(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getNome() {
        return nome;
    }

}
