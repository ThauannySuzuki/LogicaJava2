package exerciciosBasicos;
//Faça um programa que verifique se um número é positivo, negativo ou zero.
import java.util.Scanner;
public class EX16 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = leitura.nextDouble();

        if (numero==0){
            System.out.println("O número é 0");
        } else if (numero<0) {
            System.out.println("O número é negativo");
        }else {
            System.out.println("O número é positivo");
        }

    }
}
