package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Escreva um programa para ler 3 números inteiros e imprimir o maior deles.
		
		int n1, n2, n3;
		
		System.out.println("digite o primeiro número: ");
		n1 = sc.nextInt();
		
		System.out.println("digite o segundo número: ");
		n2 = sc.nextInt();
		
		System.out.println("digite o terceiro número");
		n3 = sc.nextInt();
		
		//quem não é menor?
		if (n1 >= n2 && n1 >= n3) {
		    System.out.println("o maior número é: " + n1);
		} 
		else if (n2 >= n1 && n2 >= n3) {
		    System.out.println("o maior número é: " + n2);
		} 
		else {
		    System.out.println("o maior número é: " + n3);
		}
	}
}
