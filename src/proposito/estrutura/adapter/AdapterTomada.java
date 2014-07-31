
package proposito.estrutura.adapter;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 31, 2014
 * 
 * Adaptador extende a classe que o sistema possui e realiza as adaptações 
 * necessárias.
 */
public class AdapterTomada extends PlugDoisPinos{
    /*
     * Objeto local da interface a ser adaptada.
     */
    private PlugTresPinos plugTresPinos;
    /*
     * Construtor recebe o objeto da classe que será adaptada.
     */
    public AdapterTomada(PlugTresPinos objPlugTresPinos){
        this.plugTresPinos = objPlugTresPinos;
    }
    /*
     * Pulo do Gato
     *
     * Dentro da chamada de ligar dois pinos, o que temos na verdade é um 
     * plug de três pinos, ou seja, foi adaptado uma interface existente para uma 
     * que necessitamos chamar, foi compatibilizador duas interfaces que inicialmente
     * não eram compatíveis entre si.
     */
    @Override
    public void ligarDoisPinos(Tomada objTomada){
        plugTresPinos.ligarTresPinos(objTomada);
    }
}
