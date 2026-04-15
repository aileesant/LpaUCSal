package Aplicacao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Q.10 Escreva um programa que, dada a idade de um nadador, classifique-o em
		 * uma das seguintes categorias:
		 * 
		 * infantil = 8 – 10 anos juvenil A = 11- 13 anos juvenil B = 14 – 17 anos
		 * sênior = maiores de 18 anos.
		 */

		int idade;
		System.out.println("Digite sua idade:");
		idade = sc.nextInt();

		if (idade >= 8 && idade <= 10) { // && signifiva "e"
			System.out.println("infantil");

		} else if (idade >= 11 && idade <= 13) {
			System.out.println("juvenil A");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("juvenil B");
		}

		else {
			System.out.println("Sênior");

		}

	}

}
