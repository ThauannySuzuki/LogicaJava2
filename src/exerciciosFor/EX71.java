package exerciciosFor;
import java.util.Scanner;

public class EX71 {
    public static void main(String[] args) {
        //Crie um programa que leia um n mero inteiro positivo e exiba todos os divisores desse n mero.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n mero inteiro positivo: ");
        int numero = scanner.nextInt();

        System.out.println("Divisores de " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

}
