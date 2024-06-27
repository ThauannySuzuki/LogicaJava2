package exerciciosBasicos;
import java.util.Scanner;

//Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias de vida ela tem.
public class EX14 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite qual ano voce esta: ");
        int anoatual = leitura.nextInt();



        System.out.println("Digite quantos anos você tem: ");
        int anos = leitura.nextInt();

        System.out.println("Digite em que mês você nasceu: ");
        int meses = leitura.nextInt();

        System.out.println("Digite em que dia você nasceu: ");
        int dias = leitura.nextInt();

        double ano = anos*365;

    }
}
