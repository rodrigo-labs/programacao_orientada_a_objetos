package aula5.exercicio1;

/**
 * Created by rodrigo on 08/04/17.
 */
public class TesteFrotaDeVeiculos {

    public static void main(String[] args) {
        FrotaDeVeiculos frota = new FrotaDeVeiculos();
        Passeio cp1 = new Passeio();
        Carga cc1 = new Carga();

        cp1.setPlaca("aaa1234");
        cp1.setMarca("fiat");
        cp1.setModelo("uno de firma");
        cp1.setAno(2008);
        cp1.setValorKmRodado(10);
        cp1.setKmInicial(10000);
        cp1.setKmFinal(10050);
        cp1.setArCondicionado(true);
        cp1.setNumeroDePortas(4);

        System.out.println(cp1);
        System.out.println();
        System.out.println("Aluguel: " + cp1.calcula());

        cc1.setPlaca("aab2345");
        cc1.setMarca("ford");
        cc1.setModelo("f250");
        cc1.setAno(2014);
        cc1.setValorKmRodado(30);
        cc1.setKmInicial(50000);
        cc1.setKmFinal(50100);
        cc1.setCapacidadeDeCarga(3.5);

        System.out.println();
        System.out.println();
        System.out.println(cc1);
        System.out.println("Aluguel: " + cc1.calcula());

        System.out.println();
        frota.add(cp1);
        frota.add(cc1);
        System.out.println("Frota atual: " + frota.size() + " carros");
        System.out.println();
        System.out.println(frota);

        System.out.println(frota.binarySearch("aaa1234", 0, 2));
        System.out.println(frota.binarySearch("aab2345", 0, 2));
        System.out.println();

        frota.remove(frota.binarySearch("aaa1234", 0, 2));
        System.out.println(frota);

        System.out.println();
        System.out.println(frota.showVeiculo(0));
    }
}
