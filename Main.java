import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Funcionário padrão");
            System.out.println("2 - Comissionado");
            System.out.println("3 - Produção");
            System.out.println("4 - Folha de pagamento");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {

                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Matrícula: ");
                String mat = sc.nextLine();

                lista.add(new Funcionario(nome, mat));
            }

            else if (opcao == 2) {

                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Matrícula: ");
                String mat = sc.nextLine();

                System.out.print("Vendas: ");
                double vendas = sc.nextDouble();

                System.out.print("Percentual: ");
                double perc = sc.nextDouble();

                lista.add(new Comissionado(nome, mat, vendas, perc));
            }

            else if (opcao == 3) {

                sc.nextLine();
                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Matrícula: ");
                String mat = sc.nextLine();

                System.out.print("Peças: ");
                int pecas = sc.nextInt();

                System.out.print("Valor peça: ");
                double valor = sc.nextDouble();

                lista.add(new Producao(nome, mat, pecas, valor));
            }

            else if (opcao == 4) {

                System.out.println("\n--- FOLHA DE PAGAMENTO ---");

                for (Funcionario f : lista) {
                    f.exibir();
                }
            }

        } while (opcao != 0);

        sc.close();
    }
}
