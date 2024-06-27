package exerciciosVetores;
import java.util.Scanner;

public class EX87 {
    public static void main(String[] args) {
        // fa a um programa que leia 10 n meros inteiros e exiba quantos deles s o positivos.

        Scanner scanner = new Scanner(System.in);

        int contadorPositivos = 0;

        System.out.println("Digite 10 n meros inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            }
        }

        System.out.println("Quantidade de n meros positivos: " + contadorPositivos);

        scanner.close();
    }


}
