package exerciciosBasicos;

import java.util.Scanner;
//Escreva um programa que leia o raio de um círculo e calcule sua área e perímetro.

public class EX2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // representa a entrada de dados pelo teclado



        System.out.println("Digite o RAIO: ");
        double raio = teclado.nextDouble();

        double area = 3.14 * (raio*raio);
        System.out.println("a area do circulo é: " + area);


        double perimetro = 6.28 * raio;
        System.out.println("O perimetro do circulo é: " + perimetro);
    }
}
