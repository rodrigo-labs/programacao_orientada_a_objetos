package trabalhoContatos;

import java.util.ArrayList;

/**
 * Created by rodrigo on 06/06/17.
 */
public class GestaoDeContatos {

    private ArrayList<Contato> familia = new ArrayList<>();
    private ArrayList<Contato> amigos = new ArrayList<>();
    private ArrayList<Contato> profissional = new ArrayList<>();


    public void adicionaContato(Contato contato, int flag) {
        if (flag == 1) {
            familia.add(contato);
        } else if (flag == 2) {
            amigos.add(contato);
        } else {
            profissional.add(contato);
        }
    }

    public void excluirContato(String nome, int flag) {
        ArrayList<Contato> lista;

        if (flag == 1) {
            lista = familia;
        } else if (flag == 2) {
            lista = amigos;
        } else {
            lista = profissional;
        }

        for (Contato contato : lista) {
            if (nome.equals(contato.getNome())) {
                lista.remove(contato);
            }
        }
    }

    public void listarContatos(int flag) {
        if (flag == 1) {
            System.out.println(familia);
        } else if (flag == 2) {
            System.out.println(amigos);
        } else {
            System.out.println(profissional);
        }
    }

    public ArrayList<Contato> getMaisVelho(int flag) {
        ArrayList<Contato> resultado = new ArrayList<>();
        ArrayList<Contato> lista;

        if (flag == 1) {
            lista = familia;
        } else if (flag == 2) {
            lista = amigos;
        } else {
            lista = profissional;
        }

        Contato maisVelho = null;
        int maior = 0;
        for (Contato contato : lista) {
            if (maior < contato.getIdade()) {
                maior = contato.getIdade();
                maisVelho = contato;
            }
        }

        resultado.add(maisVelho);
        return resultado;
    }

    public ArrayList<Contato> getMaisNovo(int flag) {
        ArrayList<Contato> resultado = new ArrayList<>();
        ArrayList<Contato> lista;

        if (flag == 1) {
            lista = familia;
        } else if (flag == 2) {
            lista = amigos;
        } else {
            lista = profissional;
        }

        Contato maisNovo = null;
        int menor = 1000;
        for (Contato contato : lista) {
            if (menor > contato.getIdade()) {
                menor = contato.getIdade();
                maisNovo = contato;
            }
        }

        resultado.add(maisNovo);
        return resultado;
    }

    public ArrayList<Contato> getProfissionaisAmigos() {
        ArrayList<Contato> resultado = new ArrayList();

        for (Contato contatoAmigos : amigos) {
            for (Contato contatoProfissionais : profissional) {
                if (contatoAmigos.equals(contatoProfissionais)) {
                    resultado.add(contatoAmigos);
                }
            }
        }

        return resultado;
    }

    public ArrayList<Contato> escalaoEtario(int idadeMinima, int idadeMaxima, int flag) {
        ArrayList<Contato> resultado = new ArrayList();
        ArrayList<Contato> lista;

        if (flag == 1) {
            lista = familia;
        } else if (flag == 2) {
            lista = amigos;
        } else {
            lista = profissional;
        }

        for (Contato contato : lista) {
            if (contato.getIdade() > idadeMinima && contato.getIdade() < idadeMaxima) {
                resultado.add(contato);
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "GestaoDeContatos{}";
    }
}
