package exerciciosVetores;
import java.util.Scanner;

public class EX89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorPositivos = 0;
        int contadorNegativos = 0;

        System.out.println("Digite 10 n meros inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            } else if (numero < 0) {
                contadorNegativos++;
            }
        }

        System.out.println("Quantidade de n meros positivos: " + contadorPositivos);
        System.out.println("Quantidade de n meros negativos: " + contadorNegativos);

        scanner.close();
    }


}
