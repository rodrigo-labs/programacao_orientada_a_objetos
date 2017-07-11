package aula4.exercicio1;

/**
 * Created by rodrigo on 30/03/17.
 */
public class Peixe extends Animal {

    public Peixe(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    @Override
    public void locomover() {
        System.out.println("Nadando como um peixe");
    }

    public void beijar() {
        System.out.println("Smack-Smack!");
    }
}
