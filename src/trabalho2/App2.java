import java.util.Scanner;

/**
 * Created by rodrigo on 28/06/17.
 */
public class App2 {

    public static void main(String[] args) {
        Medico medico = new Medico();
        Enfermeiro enfermeiro = new Enfermeiro();
        Odontologo odontologo = new Odontologo();
        Paciente paciente = new Paciente();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do médico: ");
        medico.setNome(scanner.nextLine());
        System.out.print("Informe o CRM do médico: ");
        medico.setCrm(Integer.parseInt(scanner.nextLine()));
        System.out.print("Informe a senha do médico: ");
        String senhaMedico = scanner.nextLine();
        medico.login(medico.getCrm(), senhaMedico);

        System.out.println();
        System.out.print("Informe o nome do enfermeiro: ");
        enfermeiro.setNome(scanner.nextLine());
        System.out.print("Informe o COREN do enfermeiro: ");
        enfermeiro.setCoren(Integer.parseInt(scanner.nextLine()));
        System.out.print("Informe a senha do enfermeiro: ");
        String senhaEnfermeiro = scanner.nextLine();
        enfermeiro.login(enfermeiro.getCoren(), senhaEnfermeiro);

        System.out.println();
        System.out.print("Informe o nome do odontologo: ");
        odontologo.setNome(scanner.nextLine());
        System.out.print("Informe o CRO do odontologo: ");
        odontologo.setCro(Integer.parseInt(scanner.nextLine()));
        System.out.print("Informe a senha do odontologo: ");
        String senhaOdontologo = scanner.nextLine();
        odontologo.login(odontologo.getCro(), senhaOdontologo);

        System.out.println();
        System.out.print("Informe o nome do paciente: ");
        paciente.setNome(scanner.nextLine());
        System.out.print("Informe o CPF do paciente: ");
        paciente.setCpf(Long.parseLong(scanner.nextLine()));
        System.out.print("Informe a senha do paciente: ");
        String senhaPaciente = scanner.nextLine();
        paciente.login(paciente.getCpf(), senhaPaciente);

        System.out.println();
        medico.logout();
        enfermeiro.logout();
        odontologo.logout();
        paciente.logout();
    }
}
