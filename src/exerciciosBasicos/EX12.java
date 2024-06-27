package exerciciosBasicos;
import java.util.Scanner;
//Crie um programa que leia o peso e a altura de uma pessoa e exiba o seu Índice de Massa Corporal (IMC).
public class EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = teclado.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = teclado.nextDouble();

        double imc = peso/(altura*altura);
        System.out.println("O seu imc é: " + imc);

        if (imc >=18.5 && imc <= 24.9){
            System.out.println("O  seu peso esta normal");
        } else if (imc >=25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }else if (imc <=18.5) {
            System.out.println("Abaixo do peso");
        }else if (imc >=30 && imc <= 34.9) {
            System.out.println("Obesidadxe grau 1");
        }else if (imc >=35 && imc <= 39.9) {
            System.out.println("Obesidadxe grau 2");
        }else {
            System.out.println("Obesidadxe grau 3");

        }

    }
}
