package exerciciosBasicos;
//Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.
import java.util.Scanner;
public class EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a nota um: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a nota dois: ");
        double nota2 = teclado.nextDouble();

        System.out.println("Digite a nota tres: ");
        double nota3 = teclado.nextDouble();

        double media = (nota1+nota2+nota3)/3;
        System.out.println("A média do aluno foi: " + media);


    }
}
