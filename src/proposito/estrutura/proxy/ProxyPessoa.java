
package proposito.estrutura.proxy;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class ProxyPessoa implements Pessoa{
    
    private String nome; 
    private Pessoa pessoa; //mesma interface

    public ProxyPessoa(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String getNome() {
        if (pessoa == null) {
            /*
             * Apenas cria o objeto real quando chamar este método.
             */
            pessoa = PessoaDao.getPessoaByName(this.nome);
        }
        /*
         * Delega para o objeto real. 
         */
        return pessoa.getNome();
    }

}
