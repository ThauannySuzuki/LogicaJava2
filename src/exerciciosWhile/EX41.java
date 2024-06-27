package exerciciosWhile;
import java.util.Scanner;
public class EX41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero inteiro positivo:");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("O n mero deve ser positivo.");
            return;
        }

        System.out.println("Os divisores de " + numero + " s o:");

        int divisor = 1;

        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }

        scanner.close();
    }

}
