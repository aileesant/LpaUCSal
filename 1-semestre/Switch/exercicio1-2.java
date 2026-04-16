import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valorCompra, total;
        int tipoCliente;

        // Entrada de dados
        System.out.print("Digite o valor da compra: ");
        valorCompra = sc.nextDouble();

        System.out.println("Tipo de cliente:");
        System.out.println("1 - Comum");
        System.out.println("2 - Funcionário (10%)");
        System.out.println("3 - VIP (5%)");
        tipoCliente = sc.nextInt();

        // Estrutura switch
        switch (tipoCliente) {
            case 2:
                total = valorCompra * 0.9; // 10% desconto
                break;

            case 3:
                total = valorCompra * 0.95; // 5% desconto
                break;

            case 1:
                total = valorCompra; // sem desconto
                break;

            default:
                System.out.println("Tipo inválido!");
                total = valorCompra;
        }

        System.out.println("Total a pagar: R$ " + total);

        sc.close();
    }
}
