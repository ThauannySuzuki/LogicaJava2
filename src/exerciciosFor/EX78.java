package exerciciosFor;
import java.util.Scanner;

public class EX78 {
    public static void main(String[] args) {
        // Fa a um programa que leia um n mero inteiro e exiba os seus d gitos separadamente.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n mero inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Os d gitos do n mero " + numero + " s o:");
        exibirDigitos(numero);

        scanner.close();

    }
    public static void exibirDigitos(int numero) {
        String numeroStr = Integer.toString(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            System.out.println(numeroStr.charAt(i));
        }
    }



}
