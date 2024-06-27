package exerciciosVetores;
import java.util.Scanner;

public class EX94 {
    public static void main(String[] args) {
        // Escreva um programa que leia 7 n meros inteiros e exiba apenas os n meros pares.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 7 n meros inteiros:");

        for (int i = 1; i <= 7; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }

}
