package exerciciosFor;
import java.util.Scanner;

public class EX70 {
    public static void main(String[] args) {
        //Escreva um programa que leia um n mero inteiro e exiba a tabuada desse n mero at  o d cimo valor.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n mero inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();

    }

}
