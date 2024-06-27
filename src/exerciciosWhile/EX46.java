package exerciciosWhile;
import java.util.Scanner;
public class EX46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero inteiro:");
        int numero = scanner.nextInt();

        int soma = 0;
        int contador = 1;

        while (contador <= numero) {
            if (contador % 2 == 0) {
                soma += contador;
            }
            contador++;
        }

        System.out.println("A soma dos n meros pares entre 1 e " + numero + "  : " + soma);

        scanner.close();
    }

}
