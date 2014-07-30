
package proposito.criacao.factorymethod;

import java.util.Scanner;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * Execucao
 */
public class Aplicacao {
    public static void main(String[] args) {
        /*
         * Entrada de dados
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Nome");
        String nome = in.nextLine();
        System.out.println("Sexo");
        String sexo = in.nextLine();
        /*
         * As regras são passadas para a factory
         */
        FactoryPessoa factory = new FactoryPessoa();
        factory.getPessoa(nome, sexo);
    }
}
