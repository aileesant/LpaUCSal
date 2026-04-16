package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Suponha que você esteja desenvolvendo o sistema de um hotel que deva exibir
		mensagens na recepção para diferentes ações dos hospedes, são elas:
		1 - Fazer Check-in
		2 - Chamar serviço de quarto
		3 - Fazer pedido*/
		
		int opcao;

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Fazer Check-in");
        System.out.println("2 - Chamar serviço de quarto");
	    System.out.println("3 - Fazer pedido");

		opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.println("Check-in realizado com sucesso!");
			} else if (opcao == 2) {
				System.out.println("Serviço de quarto chamado!");
		        } else if (opcao == 3) {
		            System.out.println("Pedido realizado!");
		        } else {
		            System.out.println("Opção inválida!");
		        }

		        sc.close();
		    }
}
