
package proposito.criacao.factorymethod;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * FACTORY
 */
public class FactoryPessoa {
    /*
     * A regra é que a factory instancia a subclasse concreta correta.
     */
    public Pessoa getPessoa(String nome, String sexo){
        if(sexo.equals("M")){
            sexo = "Masculino";
            return new Homem(nome, sexo);
        }if(sexo.equals("F")){
            sexo = "Feminino";
            return new Mulher(nome, sexo);
        }else{
            return null;
        }
    }
}
