package exerciciosBasicos;
import java.util.Scanner;
//Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa.
public class EX8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor 1: ");
        int valor1 = teclado.nextInt();

        System.out.println("Digite o valor 2: ");
        int valor2 = teclado.nextInt();


        System.out.println("O valor 1: " + valor2);
        System.out.println("O valor 2: " + valor1);


    }
}
