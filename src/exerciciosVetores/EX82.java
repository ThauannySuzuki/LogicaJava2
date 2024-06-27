package exerciciosVetores;
import java.util.Scanner;

public class EX82 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.println("Digite 10 n meros inteiros:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos 10 n meros  : " + soma);

        scanner.close();

    }



}
