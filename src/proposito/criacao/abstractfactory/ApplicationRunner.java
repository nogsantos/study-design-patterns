
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
    public static void main(String[] args) {
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
    public static GuiFactory createOsSpecificFactory(){
        /*
         * Le um arquivo de configuracao que so e possivel de se sabe em tempo de
         * execucao
         */
        Integer sys = readFromConfigFile("ARQUIVO_OS_TYPE");
        /*
         * Ele retorna a factory correta que por polimorfismo na execucao da aplicacao
         * sera instanciado a factory correta
         */
        if(sys == 1){
            return new WinFactory();
        }else{
            return new OsxFactory();
        }
    }
    /*
     * Exemplo de leitura do arquivo
     */
    private static Integer readFromConfigFile(String file){
        Integer os;
        switch (file) {
            case "WINDOWS":os = 1;break;
            case "OSX"    :os = 2;break;
            default       :os = 0;break;
        }
        return os;
    }
}
