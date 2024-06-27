package exerciciosFor;
import java.util.Scanner;

public class EX76 {
    public static void main(String[] args) {
        // Escreva um programa que leia um n mero inteiro e exiba a soma de todos os n meros pares entre 1 e o n mero lido.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n mero inteiro: ");
        int numero = scanner.nextInt();

        int somaPares = 0;
        for (int i = 2; i <= numero; i += 2) {
            somaPares += i;
        }

        System.out.println("A soma dos n meros pares de 1 a " + numero + "  : " + somaPares);

        scanner.close();

    }

}
