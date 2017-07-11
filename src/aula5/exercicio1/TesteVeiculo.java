package aula5.exercicio1;

/**
 * Created by rodrigo on 08/04/17.
 */
public class TesteVeiculo {

    public static void main(String[] args) {
        Passeio carroPasseio = new Passeio();
        Carga carroCarga = new Carga();

        carroPasseio.setPlaca("aaa1234");
        carroPasseio.setMarca("fiat");
        carroPasseio.setModelo("uno de firma");
        carroPasseio.setAno(2008);
        carroPasseio.setValorKmRodado(10);
        carroPasseio.setKmInicial(10000);
        carroPasseio.setKmFinal(10050);
        carroPasseio.setArCondicionado(true);
        carroPasseio.setNumeroDePortas(4);

        System.out.println(carroPasseio);
        System.out.println();
        System.out.println("Aluguel: " + carroPasseio.calcula());

        carroCarga.setPlaca("aab2345");
        carroCarga.setMarca("ford");
        carroCarga.setModelo("f250");
        carroCarga.setAno(2014);
        carroCarga.setValorKmRodado(30);
        carroCarga.setKmInicial(50000);
        carroCarga.setKmFinal(50100);
        carroCarga.setCapacidadeDeCarga(3.5);

        System.out.println();
        System.out.println();
        System.out.println(carroCarga);
        System.out.println();
        System.out.println("Aluguel: " + carroCarga.calcula());

    }

}
