package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * Escreva um programa que lê o salário de um funcionário e calcula o seu
		 * imposto devido.
		 * 
		 * Se o salário <= 3 salários mínimos, o imposto será de 10% Se o salário > 3 e
		 * <= 10 salários mínimos, o imposto será de 20% Se o salário > 10 salários
		 * mínimos, o imposto será de 30%
		 */
		
		double salario, imposto;

		System.out.println("Digite o salário do funcionário: ");
		salario = sc.nextDouble();

		if (salario <= 3 * 1612) {
		    imposto = salario * 0.10;
		} 
		else if (salario <= 10 * 1612) {
		    imposto = salario * 0.20;
		} 
		else {
		    imposto = salario * 0.30;
		}

		System.out.println("Imposto: " + imposto);
	}
}
