package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Uma loja fornece 10% de desconto para funcionários e 5% de desconto para
		 * clientes vips. Faça um programa que calcule o valor total a ser pago por uma
		 * pessoa. O programa deverá ler o valor total da compra efetuada e um código
		 * que identifique se o comprador é um cliente comum (1), funcionário (2) ou vip
		 * (3).
		 */

		double valorCompra;
		int tipoCliente;
		double total;

		System.out.print("Digite o valor da compra: ");
		valorCompra = sc.nextDouble();

		System.out.println("Tipo de cliente:");
		System.out.println("1 - Cliente comum");
		System.out.println("2 - Funcionário (10% desconto)");
		System.out.println("3 - Cliente VIP (5% desconto)");
		tipoCliente = sc.nextInt();

		if (tipoCliente == 2) {
			total = valorCompra * 0.9;
		} else if (tipoCliente == 3) {
			total = valorCompra * 0.95;
		} else {
			total = valorCompra;
		}
		System.out.println("Total a pagar: R$ " + total);

		sc.close();
	}
}
