package aula5.exercicio1;

/**
 * Created by rodrigo on 06/04/17.
 */
public abstract class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valorKmRodado;
    private double kmInicial;
    private double kmFinal;


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorKmRodado() {
        return valorKmRodado;
    }

    public void setValorKmRodado(double valorKmRodado) {
        this.valorKmRodado = valorKmRodado;
    }

    public double getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(double kmInicial) {
        this.kmInicial = kmInicial;
    }

    public double getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(double kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getKmRodado() {
        return kmFinal - kmInicial;
    }


    public double calcula() {
        return (kmFinal - kmInicial) * valorKmRodado;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano: " + ano + "\n" +
                "Km rodados: " + getKmRodado() + "\n" +
                "Valor do km: " + valorKmRodado;
    }
}
