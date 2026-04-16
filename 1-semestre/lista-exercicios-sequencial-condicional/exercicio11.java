package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Escreva um programa que leia dois números A e B e determine se A é múltiplo de B.
		
		int A, B;

		System.out.println("Digite A:");
		A = sc.nextInt();

		System.out.println("Digite B:");
		B = sc.nextInt();

		if (A % B == 0) {
		    System.out.println("A é múltiplo de B");
		} else {
		    System.out.println("A NÃO é múltiplo de B");
		}
		
		
	}
}
