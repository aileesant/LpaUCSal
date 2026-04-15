package Aplicacao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Escreva um programa que leia um número de três algarismos e mostre o número
		// inversamente. Utilize as operações de { %, /, *, + } para resolver a questão.
		// Exemplo: 365 deve ser escrito como 563.
		int n, a, b, c, d;

		System.out.println("informe o número de 3 algarismos:");
		n = sc.nextInt();
		a = n % 10;
		b = n / 10;
		c = b % 10;
		d = b / 10;

		n = (a * 100) + (c * 10) + d;

		System.out.println("o número invertido=" + n);

	}

}
