package exerciciosFor;
import java.util.Scanner;
public class EX69 {
    public static void main(String[] args) {
        // Fa a um programa que leia 5 n meros inteiros e exiba a m dia aritm tica dos valores lidos.

        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o n mero " + i + ": ");
            numero = scanner.nextInt();
            soma += numero;
        }

        double media = (double) soma / 5;
        System.out.println("A m dia aritm tica dos valores lidos  : " + media);

        scanner.close();
    }

}
