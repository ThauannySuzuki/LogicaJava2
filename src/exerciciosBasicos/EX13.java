package exerciciosBasicos;
import java.util.Scanner;
//Faça um programa que leia dois números inteiros e verifique se o primeiro é múltiplo do segundo.
public class EX13 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = leitura.nextInt();

        System.out.println("Digite um número: ");
        int numero2 = leitura.nextInt();

        if ( numero1%numero2 == 0){
            System.out.println("O número é multiplo");
        } else {
            System.out.println("Não é multiplo");
        }
    }
}
