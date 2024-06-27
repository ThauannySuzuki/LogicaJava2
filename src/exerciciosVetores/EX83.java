package exerciciosVetores;
import java.util.Scanner;

public class EX83 {
    public static void main(String[] args) {
        // Crie um programa que leia 7 n meros inteiros e exiba a m dia aritm tica dos valores lidos.
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite 7 n meros inteiros:");

        for (int i = 1; i <= 7; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 7;
        System.out.println("A m dia aritm tica dos 7 n meros  : " + media);

        scanner.close();

    }


}
