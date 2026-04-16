package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Escreva um programa que leia dois números A e B e determine se A é múltiplo de B.
		
		int n1, n2;

		System.out.println("Digite o primeiro número:");
		n1 = sc.nextInt();

		System.out.println("Digite o segundo número:");
		n2 = sc.nextInt();

		if (n1 % n2 == 0) {
		    System.out.println("o número " + n1 + " é múltiplo de " + n2);
		} else {
		    System.out.println("o número " + n1 + " NÃO é múltiplo de " + n2);
		}
		
		
	}
}
