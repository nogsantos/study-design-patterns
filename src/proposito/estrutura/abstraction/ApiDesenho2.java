
package proposito.estrutura.abstraction;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 31, 2014
 * 
 * Concrete implementor 2/2
 */
public class ApiDesenho2 implements ApiDeDesenho{
    /*
     * Implementa o desenho da linha na tela.
     */
    @Override
    public void desenharLinha(int x, int y) {
        System.out.println("Linha desenhada do ponto x: "+x+" ao ponto y: "+y+" (mas um pouco diferente)");
    }
    
}
