package exerciciosBasicos;

import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in); // representa a entrada de dados pelo teclado


        System.out.println("Entre com um número: ");
        int numero1 = valor.nextInt();// usamos nextInt() para atributos do tipo int

        int multi1 = numero1 * 1;
        System.out.println(numero1 + " X 1: " + multi1);

        int multi2 = numero1 * 2;
        System.out.println(numero1 + " X 2: "  + multi2);

        int multi3 = numero1 * 3;
        System.out.println(numero1 + " X 3: "  + multi3);

        int multi4 = numero1 * 4;
        System.out.println(numero1 + " X 4: "  + multi4);

        int multi5 = numero1 * 5;
        System.out.println(numero1 + " X 5: "  + multi5);

        int multi6 = numero1 * 6;
        System.out.println(numero1 + " X 6: "  + multi6);

        int multi7 = numero1 * 7;
        System.out.println(numero1 + " X 7: "  + multi7);

        int multi8 = numero1 * 8;
        System.out.println(numero1 + " X 8: "  + multi8);

        int multi9 = numero1 * 9;
        System.out.println(numero1 + " X 9: "  + multi9);

        int multi10 = numero1 * 10;
        System.out.println(numero1 + " X 10: "  + multi10);
    }
}
