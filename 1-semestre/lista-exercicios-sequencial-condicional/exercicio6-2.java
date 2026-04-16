package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double p1, p2, p3, media;
		
		System.out.println("Digite o preço da gasolina no posto 1: ");
		p1 = sc.nextDouble();
		
		System.out.println("Digite o preço da gasolina no posto 2: ");
		p2 = sc.nextDouble();
		
		System.out.println("Digite o preço da gasolina no posto 3: ");
		p3 = sc.nextDouble();
		
		// Validação simples
		if (p1 <= 0 || p2 <= 0 || p3 <= 0) {
			System.out.println("Erro: os preços devem ser maiores que zero.");
		} else {
			
			// Média
			media = (p1 + p2 + p3) / 3;
			
			System.out.println("\nPreço médio da gasolina: " + media);
			
			// Descobrir o mais barato
			if (p1 < p2 && p1 < p3) {
				System.out.println("O posto 1 tem o menor preço.");
			} else if (p2 < p1 && p2 < p3) {
				System.out.println("O posto 2 tem o menor preço.");
			} else if (p3 < p1 && p3 < p2) {
				System.out.println("O posto 3 tem o menor preço.");
			} else {
				System.out.println("Há empate entre os postos mais baratos.");
			}
		}
		
		sc.close();
	}
}
