package exerciciosVetores;
import java.util.Scanner;

public class EX93 {
    public static void main(String[] args) {
        // Fa a um programa que leia 10 n meros inteiros e exiba quantos deles est o no intervalo de 10 a 50
        Scanner scanner = new Scanner(System.in);

        int contadorNoIntervalo = 0;

        System.out.println("Digite 10 n meros inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 10 && numero <= 50) {
                contadorNoIntervalo++;
            }

        }
    }
}