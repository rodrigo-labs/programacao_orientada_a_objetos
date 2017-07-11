package aula6.exercicio1;

import java.util.Scanner;

/**
 * Created by rodrigo on 24/04/17.
 */
public class AppSorteio {

    public static void main(String[] args) {
        ListaSorteio listaSorteio = new ListaSorteio();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println(menu(listaSorteio.tamanho()));

            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    Cliente cliente = new Cliente();

                    System.out.println();
                    System.out.print("Informe o nome do cliente: ");
                    cliente.setNome(scanner.nextLine());
                    System.out.print("Informe o número do celular: ");
                    cliente.setTelefone(scanner.nextLine());
                    listaSorteio.adicionar(cliente);
                    break;

                case 2:
                    System.out.println("Lista de Clientes");
                    System.out.println();
                    System.out.println(listaSorteio);
                    break;

                case 3:
                    System.out.println();
                    System.out.print("Informe o indice do cliente: ");
                    listaSorteio.remover(listaSorteio.obterCliente(Integer.parseInt(scanner.nextLine())));
                    break;

                case 4:
                    Cliente sorteado = listaSorteio.sortear();
                    System.out.println();
                    System.out.print("O cliente sorteado é: \n" + sorteado);
                    listaSorteio.remover(sorteado);
                    System.out.println();
                    break;

                case 0:
                    System.out.println();
                    System.out.print("Fim do aplicativo");
                    System.exit(0);
                    break;

                default:
                    System.out.println();
                    System.out.println("Opção Invalida!");
                    break;
            }

        } while (true);
    }

    private static String menu(int tamanho) {
        StringBuilder builder = new StringBuilder("1 - Adiciona um número a lista\n");

        if (tamanho > 0) {
            builder.append("2 - Listar clientes\n");
            builder.append("3 - Remove um número da lista\n");
            builder.append("4 - Sorteia um número da lista\n");
        }

        builder.append("0 - Finaliza o programa\n");

        return builder.toString();
    }
}
