package exerciciosBasicos;
import java.util.Scanner; // classe da biblioteca do Java para entrar com dados no sistema

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in); // representa a entrada de dados pelo teclado


        System.out.println("Entre com um número: ");
        int numero1 = valor.nextInt();// usamos nextInt() para atributos do tipo int

        System.out.println("Entre com um número: ");
        int numero2 = valor.nextInt();// usamos nextInt() para atributos do tipo int

        int soma = numero1 + numero2;
        System.out.println("a soma foi: " + soma);


        int divisao = numero1 / numero2;
        System.out.println("a divisão foi: " + divisao);


        int multi = numero1 * numero2;
        System.out.println("a Multiplicação foi: " + multi);


        int sub = numero1 - numero2;
        System.out.println("a subtração foi: " + sub);
    }
}