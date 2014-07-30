
package proposito.criacao.prototype;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * Classe cliente 
 */
public class Cliente {

    static final int DOCUMENTO_TIPO_ASCII = 0;
    static final int DOCUMENTO_TIPO_PDF   = 1;
    /*
     * Instâncias prototípicas
     */
    private Documento ascii = new AscII();
    private Documento pdf   = new Pdf();
    
    public Documento criarDocumento(int tipo){
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
