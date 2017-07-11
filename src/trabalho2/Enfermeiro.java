/**
 * Created by rodrigo on 22/06/17.
 */
public class Enfermeiro extends Profissional {

    private int coren;


    public int getCoren() {
        return coren;
    }

    public void setCoren(int coren) {
        this.coren = coren;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Coren: " + coren;
    }

    @Override
    public boolean login(long doc, String senha) {
        System.out.printf("Profissional: %s - COREN: %d - LOGADO NO SISTEMA\n", getNome(), coren);
        return true;
    }

    @Override
    public boolean logout() {
        System.out.printf("Profissional: %s - DESCONECTADO DO SISTEMA\n", getNome());
        return true;
    }
}
