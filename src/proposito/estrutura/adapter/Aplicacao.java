
package proposito.estrutura.adapter;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 31, 2014
 * 
 * Adapter
 * 
 * Converte a interface de uma classe em outra interface que normalmente 
 * não poderiam trabalhar juntas 
 * 
 * Use o Adapter quando:
 *  Você quer usar uma classe existente, e sua interface não é adequada 
 *  àquela que você precisa.
 */
public class Aplicacao {

    public static void main(String[] args) {
        /*
         * Plug de três pinos é o que precisamos nos conectar, é a interface
         * que necessitamos chamar alguma coisa contida nela. 
         */
        PlugTresPinos objPlugDeTresPinos = new PlugTresPinos();
        AdapterTomada objAdapatador      = new AdapterTomada(objPlugDeTresPinos);
        /*
         * O cliente fez a chamada usando o plug de dois pinos, que é o que ele
         * encherga, mas na verdade esta chamada está sendo "adaptada" para
         * um plug de três pinos.
         */
        objAdapatador.ligarDoisPinos(new Tomada());
    }
}
