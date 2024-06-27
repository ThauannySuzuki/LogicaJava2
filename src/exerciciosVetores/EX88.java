package exerciciosVetores;
import java.util.Scanner;

public class EX88 {

    public static void main(String[] args) {
        //Escreva um programa que leia 5 n meros inteiros e calcule a m dia dos valores pares e a m dia dos valores  mpares.
        Scanner scanner = new Scanner(System.in);

        int somaPares = 0;
        int somaImpares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;

        System.out.println("Digite 5 n meros inteiros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                somaPares += numero;
                contadorPares++;
            } else {
                somaImpares += numero;
                contadorImpares++;
            }
        }

        if (contadorPares > 0) {
            double mediaPares = (double) somaPares / contadorPares;
            System.out.println("M dia dos valores pares: " + mediaPares);
        } else {
            System.out.println("N o foram digitados n meros pares.");
        }

        if (contadorImpares > 0) {
            double mediaImpares = (double) somaImpares / contadorImpares;
            System.out.println("M dia dos valores  mpares: " + mediaImpares);
        } else {
            System.out.println("N o foram digitados n meros  mpares.");
        }

        scanner.close();
    }


}
