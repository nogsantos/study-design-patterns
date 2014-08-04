
package proposito.estrutura.flyweight;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * A fábrica retorna os Flyweights para o cliente, que os utiliza 
 * passando uma configuração de contexto.
 */
public class Aplicacao {

    public static void main(String[] args) {
        
        Factory f = new Factory(Caractere.MAX_VALUE);
        /*
         * Cria o primeiro e o segundo Flyweight
         */
        f.getCaractere('p').desenharNaTela(new Contexto(1, 1));
        f.getCaractere('a').desenharNaTela(new Contexto(1, 2));
        /*
         * Cria o terceiro flyweight
         */
        f.getCaractere('s').desenharNaTela(new Contexto(1, 3));
        /*
         * Não Cria nada utiliza um flyweight já existente
         */
        f.getCaractere('s').desenharNaTela(new Contexto(1, 4));
        /*
         * Cria os últimos flyweights
         */
        f.getCaractere('e').desenharNaTela(new Contexto(1, 5));
        f.getCaractere('i').desenharNaTela(new Contexto(1, 6));
        
    }
}
