package aula4.exercicio1;

/**
 * Created by rodrigo on 31/03/17.
 */
public class TesteAnimal {

    public static void main(String[] args) {
        Cachorro cao = new Cachorro("Horus", 7, "M");
        Gato gato = new Gato("Mimiti", 15, "F");
        Peixe peixe = new Peixe("Dourado", 2, "F");

        System.out.println(cao);
        cao.comer();
        cao.dormir();
        cao.latir();
        cao.locomover();

        System.out.println();

        System.out.println(gato);
        gato.comer();
        gato.dormir();
        gato.miar();
        gato.locomover();

        System.out.println();

        System.out.println(peixe);
        peixe.comer();
        peixe.dormir();
        peixe.beijar();
        peixe.locomover();
    }
}
