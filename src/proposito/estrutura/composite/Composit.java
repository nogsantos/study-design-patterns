
package proposito.estrutura.composite;

import java.util.ArrayList;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 1, 2014
 * 
 * Classe composta complexa. Implementa uma recursividade da classe componente.
 * 
 * Composite é o padrão de se manipular elementos em uma hierarquia parte todo
 * tornando transparente para o cliente se ele está manipulando uma folha ou uma
 * composição de objetos.
 */
public class Composit implements Componente{
    /**
     * Criando a lista de componentes filhos
     * 
     * Agregação recursiva
     */
    private ArrayList<Componente> componentesFilhos = new ArrayList<>();
    /**
     * 
     * Implementando a impressão da lista.
     * ele vai de compoente filho por componente filho os imprimindo na tela
     * 
     */
    @Override
    public void print(){
        for(Componente c : componentesFilhos){
            c.print();
        }
    }
    /**
     * Adicionando componentes a lista
     * @param c
     */
    public void add(Componente c){
        componentesFilhos.add(c);
    }
    /**
     * Removendo componentes da lista
     * @param c
     */
    public void remove(Componente c){
        componentesFilhos.remove(c);
    }
}
