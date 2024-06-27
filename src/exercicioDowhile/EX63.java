package exercicioDowhile;
import java.util.Scanner;

public class EX63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero:");
        int numero = scanner.nextInt();

        System.out.println("Os d gitos do n mero " + numero + " s o:");

        int temp = numero;
        do {
            int digito = temp % 10;
            System.out.println(digito);
            temp /= 10;
        } while (temp != 0);

        scanner.close();
    }

}
