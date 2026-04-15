package Aplicacao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Escreva um programa que leia uma velocidade em km/h e imprima o resultado em m/s,
		//da seguinte forma: “ xxx km/h equivalem a yyy m/s”
		//obs: 3,6 km/h = 1 m/s
		
		float km, ms;
		System.out.println("diga uma velocidade em km/h");
		km = sc.nextFloat();
		ms = km / 3.6f; // tem que usar f quando for float, senão ele pensa que é double
		System.out.println(km +"km/h equivalem a  " + ms + "m/s");
		
	}

}
