import java.util.ArrayList;
import java.util.List;

/**
 * Created by rodrigo on 24/06/17.
 */
public class EquipeSaude {

    private int cnes;
    private String municipio;
    private Endereco endereco;
    private Medico medico;
    private Enfermeiro enfermeiro;
    private Odontologo odontologo;
    private List<Paciente> pacientes = new ArrayList<>();


    public EquipeSaude(Endereco endereco) {
        this.endereco = endereco;
    }


    public int getCnes() {
        return cnes;
    }

    public void setCnes(int cnes) {
        this.cnes = cnes;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public void setEnfermeiro(Enfermeiro enfermeiro) {
        this.enfermeiro = enfermeiro;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }

    public void setPaciente(Paciente paciente) {
        this.pacientes.add(paciente);
    }

    public void relatorioPacientes() {
        int contador = 1;

        System.out.println();
        System.out.println("Total de pacientes: " + pacientes.size());
        for (Paciente paciente : pacientes) {
            System.out.println("Paciente " + contador + ": " + paciente);
            contador++;
        }
    }
}
