package aula5.exercicio1;

/**
 * Created by rodrigo on 06/04/17.
 */
public class Carga extends Veiculo {

    private double capacidadeDeCarga;


    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    public double calcula() {
        double valor;

        valor = super.calcula();
        valor += valor * 0.1;

        return valor;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Capacidade de carga: " + capacidadeDeCarga;
    }
}
