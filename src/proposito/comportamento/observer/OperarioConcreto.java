
package proposito.comportamento.observer;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class OperarioConcreto implements Operario{

    private SireneConcreta objObservado;
    
    public OperarioConcreto(SireneConcreta o){
        this.objObservado = o;
        objObservado.adicionarObservador(this);
    }
    
    @Override
    public void atualizar(Sirene s) {
        if (s == objObservado) {
            System.out.println("[INFO] A sirene mudou seu estado para: " + objObservado.getAlerta());
        }
    }

}
