package exerciciosBasicos;
import java.util.Scanner;
//Crie um programa que leia a base e a altura de um triângulo e calcule sua área.
public class EX3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = teclado.nextDouble();

        System.out.println("Digite a Base: ");
        double base = teclado.nextDouble();


        double area = (altura * base) /2;
        System.out.println("A Area do triangulo é: " + area);
    }
}
