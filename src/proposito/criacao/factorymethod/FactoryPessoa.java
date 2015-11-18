
package proposito.criacao.factorymethod;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * FACTORY Method
 * Define uma interface para criar um objeto, mas deixa as subclasses decidirem 
 * qual classe instanciar
 * 
 * Use Factory Method quando:
 *  Uma classe não pode antecipar a classe de objetos que ela deve criar
 *  Uma classe quer que suas subclasses especifiquem os objetos que ela cria
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
