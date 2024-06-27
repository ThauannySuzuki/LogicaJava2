package exerciciosBasicos;
import java.util.Scanner;

//Faça um programa que receba três notas de um aluno (cada nota de 0 a 10) e calcule a média ponderada considerando pesos 2, 3 e 5 para as notas, respectivamente.

public class EX4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua nota um: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite sua nota dois: ");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite sua nota tres: ");
        double nota3 = teclado.nextDouble();

        double media = (nota1*2 + nota2*3 + nota3*5) / 10;
        System.out.println("A média ponderado foi de: " + media);

    }
}
