package aula5.exercicio1;

/**
 * Created by rodrigo on 06/04/17.
 */
public class FrotaDeVeiculos {

    private static final int SIZE = 10;
    private Veiculo[] veiculos = new Veiculo[SIZE];
    private int cursor = 0;


    // adiciona um veiculo em uma posicao expecifica da lista
    public void add(Veiculo veiculo) {
        if (isFull()) {
            throw new IllegalArgumentException("Lista cheia");
        }

        int posicao = getPosicao(veiculo.getPlaca());

        for (int i = cursor; i > posicao; i--) {
            veiculos[i] = veiculos[i - 1];
        }

        veiculos[posicao] = veiculo;
        cursor++;
    }

    // recebe uma posicao e remove um veiculo da lista
    public void remove(int posicao) {
        if (isEmpty()) {
            throw new IllegalArgumentException("Lista vazia");
        } else if (posicao >= SIZE) {
            throw new IllegalArgumentException("Posiçao invalida");
        }

        for (int i = posicao; i < cursor - 1; i++) {
            veiculos[i] = veiculos[i + 1];
        }

        cursor--;
    }

    // recebe um valor e retorna o indice se esta na lista ou -1 se nao esta
    public int binarySearch(String value, int first, int last) {
        if (isEmpty()) {
            throw new IllegalArgumentException("Lista vazia");
        }

        if (first > last) {
            return -1;
        } else {
            int mid = (first + last) / 2;

            if (veiculos[mid].getPlaca().equals(value)) {
                return mid;
            }

            if (veiculos[mid].getPlaca().compareTo(value) < 0) {
                return binarySearch(value, mid + 1, last);
            } else {
                return binarySearch(value, first,mid - 1);
            }
        }
    }

    // recebe um indice e lista um carro
    public String showVeiculo(int posicao) {
        return veiculos[posicao].toString();
    }

    // devolve o tamanho da lista
    public int size() {
        return cursor;
    }

    // devolve a posicao que um veiculo deve ser adicionado (atraves da placa)
    private int getPosicao(String placa) {
        if (isEmpty()) {
            return 0;
        } else if (placa.compareTo(veiculos[cursor - 1].getPlaca()) > 0) {
            return cursor;
        } else {
            for (int i = 0; i < cursor; i++) {
                if(placa.equals(veiculos[i].getPlaca())) {
                    throw new IllegalArgumentException("Carro já cadastrado");
                } else if (placa.compareTo(veiculos[i].getPlaca()) < 0) {
                    return i;
                }
            }
        }

        return 0;
    }

    // verifica se a lista esta vazia
    private boolean isEmpty() {
        return cursor <= 0;
    }

    // verifica se a lista esta cheia
    private boolean isFull() {
        return cursor >= SIZE;
    }

    @Override
    public String toString() {
        String show = "";

        if (isEmpty()) {
            show = "[]";
        } else {
            for (int i = 0; i < cursor; i++) {
                show += "[" + veiculos[i].getPlaca() + "]\n";
            }
        }

        return show;
    }
}