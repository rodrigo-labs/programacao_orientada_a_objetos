/**
 * Created by rodrigo on 22/06/17.
 */
public class Medico extends Profissional {

    private int crm;


    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CRM: " + crm;
    }

    @Override
    public boolean login(long doc, String senha) {
        System.out.printf("Profissional: %s - CRM: %d - LOGADO NO SISTEMA\n", getNome(), crm);
        return true;
    }

    @Override
    public boolean logout() {
        System.out.printf("Profissional: %s - DESCONECTADO DO SISTEMA\n", getNome());
        return true;
    }
}