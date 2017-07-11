/**
 * Created by rodrigo on 22/06/17.
 */
public abstract class Profissional implements Autenticavel {

    private String nome;
    private long telefone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n";
    }
}
