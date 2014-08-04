
package proposito.comportamento.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class IteratorDemo {
    
    public static void main(String[] args) {
        /*
         * Cria um arraylist
         */
        ArrayList al = new ArrayList();
        /*
         * Adiciona elementos a coleção
         */
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        /*
         * Utiliza o iterator para visualizar o conteúdo da coleção
         */
        Iterator itr = al.iterator();
        /*
         * hasNext() => IsDone()
         * next() => Next() seguido por CurrentItem()
         * Note que não há First(). First() é feito automaticamente
         * quando o iterador é criado
         */
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element+" ");
            
        }
        
    }

}
