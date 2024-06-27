package exerciciosWhile;
import java.util.Scanner;
public class EX48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero inteiro:");
        int numero = scanner.nextInt();

        System.out.println("Os d gitos do n mero " + numero + " s o:");

        int temp = numero;
        while (temp != 0) {
            int digito = temp % 10;
            System.out.println(digito);
            temp /= 10;
        }

        scanner.close();
    }

}
