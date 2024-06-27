package exerciciosVetores;
import java.util.Scanner;

public class EX84 {
    public static void main(String[] args) {
        // Fa a um programa que leia 5 n meros inteiros e exiba quantos deles s o pares.
        Scanner scanner = new Scanner(System.in);

        int contadorPares = 0;

        System.out.println("Digite 5 n meros inteiros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de n meros pares: " + contadorPares);

        scanner.close();

    }

}
