package trabalhoContatos;

import java.util.ArrayList;

/**
 * Created by rodrigo on 07/06/17.
 */
public class TesteGentaoDeContato {

    public static void main(String[] args) {
        GestaoDeContatos gc = new GestaoDeContatos();
        Contato c1 = new Contato("joice", 34, "feminino", "arquiteta", "48-999266169", "joice.gmail.com");
        Contato c2 = new Contato("mayara", 30, "feminino", "arquiteta", "48-999266169", "joice.gmail.com");
        Contato c3 = new Contato("maria luiza", 12, "feminino", "arquiteta", "48-999266169", "joice.gmail.com");


        gc.adicionaContato(c1, 2);
        gc.adicionaContato(c2, 2);
        gc.adicionaContato(c3, 2);

        gc.adicionaContato(c1, 3);
        gc.adicionaContato(c3, 3);

        ArrayList velhos = gc.getMaisVelho(2);
        ArrayList novos = gc.getMaisNovo(2);
        gc.listarContatos(2);

        System.out.println();
        gc.excluirContato("mayara", 2);
        gc.listarContatos(2);

        System.out.println();
        System.out.println(velhos);

        System.out.println();
        System.out.println(novos);

        ArrayList amigosProfissionais = gc.getProfissionaisAmigos();
        System.out.println();
        System.out.println(amigosProfissionais);

        ArrayList escalaoEtario = gc.escalaoEtario(15, 35, 2);
        System.out.println(escalaoEtario);
    }
}
