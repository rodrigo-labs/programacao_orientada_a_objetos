package aula2.exercicio1;

/**
 * Created by rodrigo on 17/03/17.
 */
public class Unidade {
    private String nome;
    private Endereco endereco;


    public Unidade(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    @Override
    public String toString() {
        return "Unidade{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
