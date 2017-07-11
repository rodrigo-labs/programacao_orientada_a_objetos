package aula4.exercicio1;

/**
 * Created by rodrigo on 30/03/17.
 */
public class Cachorro extends Animal {

    public Cachorro(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }


    @Override
    public void locomover() {
        System.out.println("Andando como um cão");
    }

    public void latir() {
        System.out.println("Au-Au!");
    }
}
