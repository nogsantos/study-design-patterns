
package proposito.estrutura.composite;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 1, 2014
 */
public class Aplicacao {

    public static void main(String[] args) {
        /*
         * Criação de dois elementos folha
         */
        Leaf folha1 = new Leaf();
        Leaf1 folha2 = new Leaf1();
        /*
         * Criação de 3 elementos compostos 
         */
        Composit c1 = new Composit();
        Composit c2 = new Composit();
        Composit c3 = new Composit();
        /*
         * Adiciona elementos ao elemento composto 
         */
        c1.add(folha1);
        c2.add(folha2);
        c1.add(folha1);
        c2.add(folha2);
        /*
         * Adiciona elementos compostos aos elementos compostos 
         * como se fosse uma recursão
         */
        c1.add(c2);
        c1.add(c3);
        c1.remove(c2);
        /*
         * Imprime na tela
         */
        c1.print();
    }
}
