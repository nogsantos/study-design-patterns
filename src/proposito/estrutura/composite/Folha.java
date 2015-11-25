
package proposito.estrutura.composite;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 1, 2014
 * 
 * Componente simples
 * 
 * Folhas em árvores são objetos que não possuem extensão, não há mais nenhuma
 * estrutura de objetos abaixo delas 
 */
public class Folha implements Componente{
    
    @Override
    public void print(){
        System.out.println("Folha");
    }
}
