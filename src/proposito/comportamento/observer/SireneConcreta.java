
package proposito.comportamento.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 * 
 * Notificador concreto
 */
public class SireneConcreta implements Sirene{

    private Boolean alertaSonoro   = false;
    private ArrayList observadores = new ArrayList();
    /**
     * Mudança de estado
     */
    public void alterarAlerta(){
        if(alertaSonoro){
            alertaSonoro = false;
        }else{
            alertaSonoro = true;
        }
        /*
         * Notificacao
         */
        notificarObservadores();
    }
    
    public Boolean getAlerta(){
        return alertaSonoro;
    }
    
    @Override
    public void adicionarObservador(Operario o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Operario o) {
        observadores.remove(o);
    }
    
    public void notificarObservadores(){
        Iterator i = observadores.iterator();
        
        while (i.hasNext()) {
            Operario o = (Operario) i.next();
            o.atualizar(this);
        }
    }

}
