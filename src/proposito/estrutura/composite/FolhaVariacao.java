
package proposito.estrutura.composite;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 1, 2014
 * 
 * Folhas em árvores são objetos que não possuem extensão, não há mais nenhuma
 * estrutura de objetos abaixo delas 
 */
public class FolhaVariacao implements Componente{
    
    @Override
    public void print(){
        System.out.println("Variação do componente concreto");
    }
}
