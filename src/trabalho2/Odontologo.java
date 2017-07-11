/**
 * Created by rodrigo on 22/06/17.
 */
public class Odontologo extends Profissional {

    private int cro;


    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CRO: " + cro;
    }

    @Override
    public boolean login(long doc, String senha) {
        System.out.printf("Profissional: %s - CRO: %d - LOGADO NO SISTEMA\n", getNome(), cro);
        return true;
    }

    @Override
    public boolean logout() {
        System.out.printf("Profissional: %s - DESCONECTADO DO SISTEMA\n", getNome());
        return true;
    }
}
