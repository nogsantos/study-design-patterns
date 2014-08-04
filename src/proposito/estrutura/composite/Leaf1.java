
package proposito.estrutura.composite;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 1, 2014
 * 
 * Folhas em árvores são objetos que não possuem extensão, não há mais nenhuma
 * estrutura de objetos abaixo delas 
 */
public class Leaf1 extends Component{
    
    @Override
    public void print(){
        System.out.println("Leaf #1");
    }
}
