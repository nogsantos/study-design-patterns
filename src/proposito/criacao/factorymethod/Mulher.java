
package proposito.criacao.factorymethod;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * Subclasse produto CONCRETO
 */
public class Mulher extends Pessoa{

    public Mulher(String nome, String sexo) {
        System.out.println("Olá senhora " + nome + "\nSexo "+sexo);
    }
    
}
