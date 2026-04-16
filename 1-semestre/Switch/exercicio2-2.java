import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;

        // Menu
        System.out.println("1 - Check-in");
        System.out.println("2 - Serviço de quarto");
        System.out.println("3 - Fazer pedido");
        opcao = sc.nextInt();

        // Switch
        switch (opcao) {
            case 1:
                System.out.println("Check-in realizado!");
                break;

            case 2:
                System.out.println("Serviço de quarto chamado!");
                break;

            case 3:
                System.out.println("Pedido realizado!");
                break;

            default:
                System.out.println("Opção inválida!");
        }

        sc.close();
    }
}
