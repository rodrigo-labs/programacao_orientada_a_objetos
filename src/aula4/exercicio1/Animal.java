package aula4.exercicio1;

/**
 * Created by rodrigo on 30/03/17.
 */
public abstract class Animal {
    private String nome;
    private int idade;
    private String sexo;


    public Animal(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome + ", " + idade + " anos, " + sexo;
    }

    public void comer() {
        System.out.println("Nhac-Nhac");
    }

    public void dormir() {
        System.out.println("ZZZzzzZZZzzzZz");
    }

    public abstract void locomover();
}
