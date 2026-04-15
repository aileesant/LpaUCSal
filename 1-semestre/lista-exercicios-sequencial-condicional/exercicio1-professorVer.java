//exerc 5 -professor
package Aplicacao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// O número 3025 tem uma propriedade interessante: 30 + 25 = 55 e
		// (55)2 = 3025. Escreva um programa que lê um número inteiro e
		// determina se ele possui ou não essa propriedade.
		// 11/04/2026

		int n, a, b, soma;

		System.out.println("informe um número de três algarismos");
		n = sc.nextInt();
		a = n / 100;
		b = n % 100;
		soma = a + b;
		if (soma * soma == n) {
			System.out.println("satisfaz a propriedade");

		} else {
			System.out.println("não satisfaz a propriedade");
		}
	}

}
