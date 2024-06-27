package exercicioDowhile;
import java.util.Scanner;

public class EX64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero inteiro para calcular o fatorial:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O n mero deve ser n o-negativo.");
        } else {
            int fatorial = 1;
            int contador = 1;

            do {
                fatorial *= contador;
                contador++;
            } while (contador <= numero);

            System.out.println("O fatorial de " + numero + "  : " + fatorial);
        }

        scanner.close();
    }

}
