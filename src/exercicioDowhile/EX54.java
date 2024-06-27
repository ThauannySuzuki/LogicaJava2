package exercicioDowhile;

import java.util.Scanner;

public class EX54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumeros = 5;
        int contador = 0;
        int soma = 0;

        do {
            System.out.println("Digite o n mero " + (contador + 1) + ":");
            int numero = scanner.nextInt();
            soma += numero;
            contador++;
        } while (contador < totalNumeros);

        double media = (double) soma / totalNumeros;

        System.out.println("A m dia aritm tica dos n meros  : " + media);

        scanner.close();
    }

}
