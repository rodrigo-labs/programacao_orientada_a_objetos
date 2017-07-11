import java.util.Scanner;

/**
 * Created by rodrigo on 24/06/17.
 */
public class app1 {

    public static void main(String[] args) {
        EquipeSaude equipeSaude = new EquipeSaude(new Endereco());
        Medico medico = new Medico();
        Enfermeiro enfermeiro = new Enfermeiro();
        Odontologo odontologo = new Odontologo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o município: ");
        equipeSaude.setMunicipio(scanner.nextLine());
        System.out.print("Informe o CNES: ");
        equipeSaude.setCnes(Integer.parseInt(scanner.nextLine()));
        System.out.print("Informe o bairro: ");
        equipeSaude.getEndereco().setBairro(scanner.nextLine());

        System.out.print("Informe o nome do médico: ");
        medico.setNome(scanner.nextLine());
        System.out.print("Informe o CRM do médico: ");
        medico.setCrm(Integer.parseInt(scanner.nextLine()));
        equipeSaude.setMedico(medico);

        System.out.print("Informe o nome do enfermeiro: ");
        enfermeiro.setNome(scanner.nextLine());
        System.out.print("Informe o COREN do enfermeiro: ");
        enfermeiro.setCoren(Integer.parseInt(scanner.nextLine()));
        equipeSaude.setEnfermeiro(enfermeiro);

        System.out.print("Informe o nome do odontologo: ");
        odontologo.setNome(scanner.nextLine());
        System.out.print("Informe o CRO do odontologo: ");
        odontologo.setCro(Integer.parseInt(scanner.nextLine()));
        equipeSaude.setOdontologo(odontologo);

        System.out.println();
        System.out.printf("Equipe %d - Localizada em %s no bairro %s\n", equipeSaude.getCnes(), equipeSaude.getMunicipio(), equipeSaude.getEndereco().getBairro());
        System.out.printf("Profissional: %s - CRM: %d\n", equipeSaude.getMedico().getNome(), equipeSaude.getMedico().getCrm());
        System.out.printf("Profissional: %s - COREN: %d\n", equipeSaude.getEnfermeiro().getNome(), equipeSaude.getEnfermeiro().getCoren());
        System.out.printf("Profissional: %s - CRO: %d\n", equipeSaude.getOdontologo().getNome(), equipeSaude.getOdontologo().getCro());
    }
}
