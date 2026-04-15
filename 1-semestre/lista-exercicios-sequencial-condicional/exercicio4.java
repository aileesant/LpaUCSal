package Aplicacao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Escreva um programa que tendo como dados de entrada a altura e o sexo de uma
		// pessoa,
		// calcule o seu peso ideal, utilizando as seguintes fórmulas:
		// Para homens = (72.7 * h) – 44.7
		// Para mulheres = (62.1 * h) – 44.7
		float pesoIdeal, altura;
		char sexo;

		System.out.println("infrome a sua altura");
		altura = sc.nextFloat();
		System.out.println("informe se vc é F ou M");
		sexo = sc.next().charAt(0);
		if (sexo == 'f') {
			pesoIdeal = (62.1f * altura) - 44.7f;

		} else {
			pesoIdeal = (72.7f * altura) - 44.7f;

		}

		System.out.println("seu peso ideal é: " + pesoIdeal);
	}

}
