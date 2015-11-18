
package proposito.criacao.factorymethod;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * Factory
 */
public class FactoryPessoa {
    /*
     * A regra é que a factory instancia a subclasse concreta correta.
     */
    public Pessoa getPessoa(String nome, String sexo) throws Exception{
        switch (sexo) {
            case "M":
                sexo = "Masculino";
                return new Homem(nome, sexo);
            case "F":
                sexo = "Feminino";
                return new Mulher(nome, sexo);
            default:
                throw new Exception("Sexo indefinido");
        }
    }
}
