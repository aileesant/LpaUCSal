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
		
		media = (p1 + p2 + p3) / 3;
		
		System.out.println("O preço médio da gasolina é: " + media);
		
		sc.close();
	}
}

/*Escreva um programa capaz de calcular 
* o preço médio da gasolina considerando 
* três postos de combustível de Salvador.
* É necessário fazer a leitura 
* do preço da gasolina nos três postos.*/
