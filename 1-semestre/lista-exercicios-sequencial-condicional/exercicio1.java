//11/04/2026
//AULA 2: EXERCÍCIO 5

package Aplicacao;

import java.util.Scanner;

public class Kaprekar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede um número ao usuário
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        // Converte o número para texto (String)
        // Isso facilita para separar o número em partes
        String str = String.valueOf(num);

        // Pega o tamanho do número (quantos dígitos tem)
        int tamanho = str.length();

        // Variável para verificar se tem a propriedade
        boolean temPropriedade = false;

        // Aqui vamos testar todas as formas de dividir o número
        // Ex: 3025 -> 3|025, 30|25, 302|5
        for (int i = 1; i < tamanho; i++) {

            // Primeira parte (da esquerda até i)
            String parte1 = str.substring(0, i);

            // Segunda parte (de i até o final)
            String parte2 = str.substring(i);

            // Converte as partes para número inteiro
            int p1 = Integer.parseInt(parte1);
            int p2 = Integer.parseInt(parte2);

            // Soma as duas partes
            int soma = p1 + p2;

            // Verifica se o quadrado da soma é igual ao número original
            if (soma * soma == num) {
                temPropriedade = true; // Achou a propriedade
                break; // Não precisa continuar testando
            }
        }

        // Mostra o resultado final
        if (temPropriedade) {
            System.out.println("Possui a propriedade!");
        } else {
            System.out.println("Não possui a propriedade.");
        }

        sc.close(); // Fecha o Scanner
    }
}
