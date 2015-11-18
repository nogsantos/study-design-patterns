
package proposito.criacao.prototype;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * Prototype
 * 
 * Especifica os tipos de objetos para criar usando uma instância prototípica, 
 * e cria novos objetos copiando este protótipo (clonando o objeto original) e
 * possibilita alterar partes desse objeto.
 * 
 * Use Prototype quando:
 *  O sistema possui componentes cujo estado inicial tem poucas variações, 
 *  e é conveniente disponibilizar um conjunto pré estabelecido de protótipos 
 *  que dão origem aos objetos que compõem o sistema.
 */
public class Cliente {

    static final int DOCUMENTO_TIPO_ASCII = 0;
    static final int DOCUMENTO_TIPO_PDF   = 1;
    /*
     * Instâncias prototípicas
     */
    private Documento ascii = new AscII();
    private Documento pdf   = new Pdf();
    
    public Documento criarDocumento(int tipo) throws CloneNotSupportedException{
        /*
         * Baseado no tipo passado como parametro, são 
         * retornados clones dos objetos originais.
         */
        if(tipo == Cliente.DOCUMENTO_TIPO_ASCII ){
            return ascii.clone();
        }else{
            return pdf.clone();
        }
    }
}
