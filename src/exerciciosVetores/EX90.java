package exerciciosVetores;
import java.util.Scanner;

public class EX90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean encontrado = false;

        System.out.println("Digite 5 n meros:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("N mero " + i + ": ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Foi encontrado um n mero igual a zero.");
        } else {
            System.out.println("Nenhum n mero igual a zero foi encontrado.");
        }

        scanner.close();
    }
}
