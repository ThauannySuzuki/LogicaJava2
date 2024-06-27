package exerciciosBasicos;
import java.util.Scanner;
//Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem indicando se ela é criança, adolescente, adulto ou idoso.
public class EX17 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = leitura.nextInt();

        if (idade <= 12){
            System.out.println("É criança");
        } else if (idade == 13 || idade <=18) {
            System.out.println("É adolescente");
        } else if (idade == 19 || idade <= 65) {
            System.out.println("É adulto");
        } else if(idade >= 66){
            System.out.println("É idoso");
        }

    }
}
