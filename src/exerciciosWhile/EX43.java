package exerciciosWhile;
import java.util.Scanner;
public class EX43 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um n mero:");
    int numero = scanner.nextInt();

    int primeiroNumero = 0;
    int segundoNumero = 1;

    System.out.println("Sequ ncia de Fibonacci at  " + numero + ":");

    while (primeiroNumero <= numero) {
        System.out.print(primeiroNumero + " ");

        int proximoNumero = primeiroNumero + segundoNumero;
        primeiroNumero = segundoNumero;
        segundoNumero = proximoNumero;
    }

    scanner.close();
}

}
