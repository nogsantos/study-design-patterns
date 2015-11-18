
package proposito.criacao.abstractfactory;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since July 2014
 * 
 * Roda a aplicacao
 */
public class ApplicationRunner {
    /*
     * Executando a aplicacao
     */
    public static void main(String[] args) throws Exception {
        /*
         * Instanciando a aplicacao parametrizando qual factory deve ser instanciada.
         * Em tempo de execucao a aplicacao recebe qual a factory especifica para 
         * o SO deve ser instanciado.
         */
         new Application(createOsSpecificFactory());
    }
    /*
     * Esse exemplo de metodo le um arquivo passando o tipo de SO 
     * que retorna a factory que deve ser instanciada para a execucao da aplicacao 
     */
    public static GuiFactory createOsSpecificFactory() throws Exception{
        /*
         * Le um arquivo de configuracao que so e possivel de se sabe em tempo de
         * execucao
         *
         * ps.: Chamada singleton para consultar o S.O.
         */
        String sys = GetOperatingSystem.getInstance().getSo();
        /*
         * Ele retorna a factory correta que por polimorfismo na execucao da aplicacao
         * sera instanciado a factory correta
         */
        switch (sys) {
            case "win":
                return new WinFactory();
            case "mac":
                return new OsxFactory();
            default:
                throw new Exception("GUI Não implementada para o SO: "+sys);
        }
    }
}
