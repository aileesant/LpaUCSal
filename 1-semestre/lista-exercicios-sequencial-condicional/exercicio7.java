package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Escreva um programa para ler um número inteiro e identificar se ele é par ou
		 * ímpar, escrevendo a mensagem correspondente.
		 */

		int n, par, impar;
		
		System.out.println("escreva um número e descubra se ele é par ou ímpar!");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("o número digitado é par!");
		} 
		else {
			System.out.println("o número digitado é ímpar");
		}
		
	}
}
