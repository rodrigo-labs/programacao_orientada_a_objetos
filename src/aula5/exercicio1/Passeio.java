package aula5.exercicio1;

/**
 * Created by rodrigo on 06/04/17.
 */
public class Passeio extends Veiculo {

    private int numeroDePortas;
    private boolean arCondicionado;


    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Número de portas: " + numeroDePortas + "\n" +
                "Ar condicionado: " + arCondicionado;
    }
}
