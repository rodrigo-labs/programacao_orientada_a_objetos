package aula6.exercicio1;

/**
 * Autor: rodrigo - rodrigomv.dev@gmail.com
 * Data: 21/04/17
 */
public class TesteSorteio {

    public static void main(String[] args) {

        ListaSorteio lista = new ListaSorteio();


        System.out.println(lista);

        Cliente c1 = new Cliente();
        c1.setNome("Rodrigo");
        c1.setTelefone("996138232");
        lista.adicionar(c1);

        Cliente c2 = new Cliente();
        c2.setNome("Joice");
        c2.setTelefone("999266169");
        lista.adicionar(c2);

        Cliente c3 = new Cliente();
        c3.setNome("Mayara");
        c3.setTelefone("999102545");
        lista.adicionar(c3);

        System.out.println();
        System.out.println(lista);

        System.out.println();
        Cliente sorteado = lista.sortear();
        System.out.println(sorteado);
        lista.remover(sorteado);

        System.out.println();
        System.out.println(lista);
    }
}
