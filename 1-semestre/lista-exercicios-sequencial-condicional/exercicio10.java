package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Escreva um programa que lê um valor em reais e um tipo de moeda (1-dólar,
		 * 2-libra ou 3-peso) e faz a conversão do valor para a moeda solicitada,
		 * sabendo que 1 dólar =R$ 1,87 1 libra =R$ 3,05 1 peso = R$ 1,40.
		 */

		double valor, conver;
		int moeda;

		System.out.println("Digite um valor em reais: ");
		valor = sc.nextDouble();

		System.out.println("Escolha a moeda:");
		System.out.println("1 - Dólar");
		System.out.println("2 - Libra");
		System.out.println("3 - Peso");
		moeda = sc.nextInt();

		if (moeda == 1) {
		    conver = valor / 1.87;
		} 
		else if (moeda == 2) {
		    conver = valor / 3.05;
		} 
		else if (moeda == 3) {
		    conver = valor / 1.40;
		} 
		else {
		    System.out.println("Opção inválida");
		    return;
		}

		System.out.println("Valor convertido: " + conver);
	}
}
