package exerciciosWhile;

import java.util.Scanner;

public class EX39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contador = 1;
        int soma = 0;

        while (contador <= 5) {
            System.out.println("Digite o n mero " + contador + ":");
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        }

        double media = (double) soma / 5;

        System.out.println("A m dia aritm tica dos n meros  : " + media);

        scanner.close();
    }

}
