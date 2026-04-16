package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * Escreva um programa que leia dois números e a operação a ser realizada 
		 * (+, -, *, /)
		 */

		double num1, num2, resultado;
		char operacao;

		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();

		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();

		System.out.print("Digite a operação (+, -, *, /): ");
		operacao = sc.next().charAt(0); 
		
		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			System.out.println("Resultado: " + resultado);
			break;

		case '-':
			resultado = num1 - num2;
			System.out.println("Resultado: " + resultado);
			break;

		case '*':
			resultado = num1 * num2;
			System.out.println("Resultado: " + resultado);
			break;

		case '/':
			if (num2 != 0) { 
				resultado = num1 / num2;
				System.out.println("Resultado: " + resultado);
			} else {
				System.out.println("Erro: divisão por zero!");
			}
			break;

		default:
			System.out.println("Operação inválida!");
		}

		sc.close();
	}
}
