
package proposito.criacao.factorymethod;

import java.util.Scanner;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * FACTORY Method
 * 
 * Define uma interface para criar um objeto, mas deixa as subclasses decidirem 
 * qual classe instanciar
 * 
 * Use Factory Method quando:
 *  Uma classe não pode antecipar a classe de objetos que ela deve criar
 *  Uma classe quer que suas subclasses especifiquem os objetos que ela cria
 * 
 */
public class Aplicacao {
    public static void main(String[] args) throws Exception {
        /*
         * Entrada de dados
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Nome");
        String nome = in.nextLine();
        System.out.println("Sexo (M ou F)");
        String sexo = in.nextLine().trim().toUpperCase();
        /*
         * As regras são passadas para a factory
         */
        FactoryPessoa factory = new FactoryPessoa();
        factory.getPessoa(nome, sexo);
    }
}
