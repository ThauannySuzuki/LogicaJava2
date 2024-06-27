package exerciciosVetores;
import java.util.Scanner;

public class EX91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPositivos = 0;
        int somaNegativos = 0;

        System.out.println("Digite 10 n meros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                somaPositivos += numero;
            } else if (numero < 0) {
                somaNegativos += numero;
            }
        }

        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);

        scanner.close();
    }

}
