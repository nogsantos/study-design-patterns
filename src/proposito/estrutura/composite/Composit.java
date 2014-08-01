
package proposito.estrutura.composite;

import java.util.ArrayList;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 1, 2014
 * 
 * Classe composta
 */
public class Composit extends Component{
    /**
     * Criando a lista de componentes filhos
     * 
     * Agregação recursiva
     */
    private ArrayList<Component> childComponents = new ArrayList<>();
    /**
     * 
     * Implementando a impressão da lista.
     * ele vai de compoente filho por componente filho os imprimindo na tela
     * 
     */
    @Override
    public void print(){
        for(Component c : childComponents){
            c.print();
        }
    }
    /**
     * Adicionando componentes a lista
     * @param c
     */
    public void add(Component c){
        childComponents.add(c);
    }
    /**
     * Removendo componentes da lista
     * @param c
     */
    public void remove(Component c){
        childComponents.remove(c);
    }
}
