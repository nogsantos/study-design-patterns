
package proposito.criacao.factorymethod;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * Subclasse produto CONCRETO 
 */
public class Homem extends Pessoa{
    /*
     * Construtor
     */
    public Homem(String nome, String sexo) {
        System.out.println("Olá senhor " + nome + "\nSexo:"+ sexo);
    }

}
