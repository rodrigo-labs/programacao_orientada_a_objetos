import java.util.Scanner;

/**
 * Created by rodrigo on 28/06/17.
 */
public class App3 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        EquipeSaude equipeSaude = new EquipeSaude(endereco);
        Paciente paciente = new Paciente();
        Scanner scanner = new Scanner(System.in);
        int numeroPacientes = 0;

        System.out.print("Informe o numero de pacientes: ");
        numeroPacientes = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numeroPacientes; i++) {
            System.out.println();
            System.out.print("Informe o nome do paciente: ");
            paciente.setNome(scanner.nextLine());
            System.out.print("Informe o CPF do paciente: ");
            paciente.setCpf(Long.parseLong(scanner.nextLine()));
            equipeSaude.setPaciente(paciente);
        }

        equipeSaude.relatorioPacientes();
    }
}
