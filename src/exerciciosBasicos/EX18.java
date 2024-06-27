package exerciciosBasicos;
import java.util.Scanner;
//Crie um programa que leia dois números inteiros e exiba o maior deles.
public class EX18 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número");
         int numero1 = leitura.nextInt();

        System.out.println("Digite um número");
        int numero2 = leitura.nextInt();

        if (numero1 > numero2){
            System.out.println(numero1 + " É MAOIR");
        }else {
            System.out.println(numero2 + " É MAIOR");
        }
    }
}
