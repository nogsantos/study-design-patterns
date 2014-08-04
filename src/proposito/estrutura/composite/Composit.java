
package proposito.estrutura.composite;

import java.util.ArrayList;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 1, 2014
 * 
 * Classe composta
 * 
 * Composite é o padrão de se manipular elementos em uma hierarquia parte todo
 * tornando transparente para o cliente se ele está manipulando uma folha ou uma
 * composição de objetos.
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
