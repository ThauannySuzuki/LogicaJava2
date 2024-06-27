package exercicioDowhile;
import java.util.Scanner;

public class EX58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero inteiro:");
        int numero = scanner.nextInt();

        int primeiroNumero = 0;
        int segundoNumero = 1;

        System.out.println("Sequ ncia de Fibonacci at  " + numero + ":");

        if (numero >= 1) {
            System.out.print(primeiroNumero + " ");

            if (numero >= 2) {
                System.out.print(segundoNumero + " ");

                int contador = 2;
                do {
                    int proximoNumero = primeiroNumero + segundoNumero;
                    System.out.print(proximoNumero + " ");

                    primeiroNumero = segundoNumero;
                    segundoNumero = proximoNumero;

                    contador++;
                } while (segundoNumero <= numero);
            }
        }

        scanner.close();
    }


}
