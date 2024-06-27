package exerciciosWhile;
import java.util.Scanner;
public class EX42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero inteiro:");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;
        int divisor = 2;
        if (numero <= 1) {
            ehPrimo = false;
        }

        while (divisor <= numero / 2) {
            if (numero % divisor == 0) {
                ehPrimo = false;
                break;
            }
            divisor++;
        }

        if (ehPrimo) {
            System.out.println(numero + "   um n mero primo.");
        } else {
            System.out.println(numero + " n o   um n mero primo.");
        }

        scanner.close();
    }

}
