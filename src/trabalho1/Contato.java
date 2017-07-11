package trabalhoContatos;

/**
 * Created by rodrigo on 06/06/17.
 */
public class Contato {

    private String nome;
    private int idade;
    private String sexo;
    private String profissao;
    private String telefone;
    private String email;


    public Contato(String nome, int idade, String sexo, String profissao, String telefone, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.profissao = profissao;
        this.telefone = telefone;
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " " + idade + " anos de idade, " + "do sexo " + sexo + ", "
                + profissao + ", " + "telefone n° " + telefone + " e-mail: " + email;
    }
}
