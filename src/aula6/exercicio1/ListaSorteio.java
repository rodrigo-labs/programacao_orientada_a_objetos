package aula6.exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Autor: rodrigo - rodrigomv.dev@gmail.com
 * Data: 21/04/17
 */
public class ListaSorteio {

    private List<Cliente> lista = new ArrayList<Cliente>();


    public boolean adicionar(Cliente cliente) {
        return lista.add(cliente);
    }

    public boolean remover(Cliente cliente) {
        return lista.remove(cliente);
    }

    public Cliente sortear() {
        Random randonico = new Random();

        int sorteado;
        if (tamanho() == 1) {
            sorteado = 0;

        } else {
            sorteado = randonico.nextInt(lista.size() - 1);
        }

        return lista.get(sorteado);
    }

    public Cliente obterCliente(int indice) {
        Cliente cliente = lista.get(indice);

        return cliente;
    }

    public int tamanho() {
        return lista.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        if (lista.isEmpty()) {
            return "[]";
        } else {
            for (int i = 0; i < lista.size(); i++) {
                builder.append("[" + i + "] - " + lista.get(i).getNome() + "\n");
            }
        }

        return builder.toString();
    }
}
