package aula4.exercicio1;

/**
 * Created by rodrigo on 30/03/17.
 */
public class Gato extends Animal {

    public Gato(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }


    @Override
    public void locomover() {
        System.out.println("Andando como um gato");
    }

    public void miar() {
        System.out.println("Miaaaau!");
    }
}
