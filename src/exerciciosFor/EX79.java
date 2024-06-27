package exerciciosFor;
import java.util.Scanner;

public class EX79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n mero inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + "  : " + fatorial);

        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("N mero negativo n o possui fatorial definido.");
        }

        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

}
