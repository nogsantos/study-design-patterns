
package proposito.criacao.builder;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 29, 2014
 * 
 * Classe produto
 */
public class Pizza {
    
    private String tempero   = "";
    private String cobertura = "";
    
    public void setTempero(String tempero){
        this.tempero = tempero;
    }
    
    public void setCobertura(String cobertura){
        this.cobertura = cobertura;
    }
    
    public String finalizaPizza(){
        return "Pizza\nTempero: "+ this.tempero +"\ncobertura: "+this.cobertura;
    }
}
