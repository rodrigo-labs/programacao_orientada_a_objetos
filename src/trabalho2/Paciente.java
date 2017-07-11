/**
 * Created by rodrigo on 25/06/17.
 */
public class Paciente implements Autenticavel{

    private String nome;
    private long cpf;
    private long telefone;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean login(long doc, String senha) {
        System.out.printf("Paciente: %s - CRM: %d - LOGADO NO SISTEMA\n", nome, cpf);
        return true;
    }

    @Override
    public boolean logout() {
        System.out.printf("Paciente: %s - DESCONECTADO DO SISTEMA\n", nome);
        return true;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - CPF: " + cpf;
    }
}
