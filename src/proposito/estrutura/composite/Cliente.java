
package proposito.estrutura.composite;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 1, 2014
 */
public class Cliente {

    public static void main(String[] args) {
        /*
         * Criação de dois elementos componentes
         */
        Componente componenteUm   = new Folha();
        Componente componenteDois = new FolhaVariacao();
        /*
         * Criação de 3 elementos compostos 
         */
        Composit composicao     = new Composit();
        Composit composicaoDois = new Composit();
        Composit composicaoTres = new Composit();
        /*
         * Adiciona elementos ao elemento composto 
         */
        composicao.add(componenteUm);
        composicao.add(componenteDois);
        
        composicaoDois.add(componenteDois);
        /*
         * Adiciona elementos compostos aos elementos compostos 
         * como se fosse uma recursão
         */
        composicao.add(composicaoDois);
        composicao.add(composicaoTres);
        /*
         * Imprime na tela
         */
        composicao.print();
    }
}
