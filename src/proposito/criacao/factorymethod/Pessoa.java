
package proposito.criacao.factorymethod;

/**
 * @author Fabricio Nogueira - nogsantos
 * @since Jul 30, 2014
 * 
 * Super classe Produto ABSTRATO
 */
public abstract class Pessoa {
    public String nome;
    public String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
