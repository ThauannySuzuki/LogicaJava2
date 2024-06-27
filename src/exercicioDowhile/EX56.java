package exercicioDowhile;
import java.util.Scanner;

public class EX56 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um n mero inteiro positivo:");
    int numero = scanner.nextInt();

    if (numero <= 0) {
        System.out.println("O n mero deve ser positivo.");
    } else {
        System.out.println("Os divisores de " + numero + " s o:");

        int divisor = 1;

        do {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        } while (divisor <= numero);
    }

    scanner.close();
}


}
