package exerciciosVetores;
import java.util.Scanner;

public class EX85 {

    public static void main(String[] args) {
        // Escreva um programa que leia 5 n meros inteiros e exiba o maior e o menor valor digitado.
        Scanner scanner = new Scanner(System.in);

        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite 5 n meros inteiros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("O maior valor digitado  : " + maior);
        System.out.println("O menor valor digitado  : " + menor);

        scanner.close();

    }


}
