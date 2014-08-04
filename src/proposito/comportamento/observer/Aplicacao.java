
package proposito.comportamento.observer;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Aug 4, 2014
 */
public class Aplicacao {

    public static void main(String[] args) {
        /*
         * A sirene já começa com o valor default false 
         */
        SireneConcreta objSirene = new SireneConcreta();
        /* 
         * Já passando a sirene como parametro
         */
        OperarioConcreto obs1 = new OperarioConcreto(objSirene);
        OperarioConcreto obs2 = new OperarioConcreto(objSirene);
        /*
         * Nesse momento é chamado o metodo atualizar
         * das instâncias obs1 e obs2, saída:
         * [INFO] A sirene mudou seu estado para: true
         * [INFO] A sirene mudou seu estado para: true
         */
        objSirene.alterarAlerta();
        /*
         * Nesse momento é chamado o metodo atualizar
         * das instâncias obs1 e obs2, saída:
         * [INFO] A sirene mudou seu estado para: false
         * [INFO] A sirene mudou seu estado para: false
         */
        objSirene.alterarAlerta();
        /*
         * Obs.: 2 saídas pq temos dois observadores
         */
    }
    
}
