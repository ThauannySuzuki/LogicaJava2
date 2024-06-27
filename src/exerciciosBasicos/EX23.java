package exerciciosBasicos;
import java.util.Scanner;
//Escreva um programa que leia o nome de um mês e exiba a quantidade de dias que ele possui. Considere apenas meses válidos.
public class EX23 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o número de um mês: ");
        int mes = leitura.nextInt();

        if (mes==1){
            System.out.println("O mês é Janeiro tem 31 dias");
        } else if (mes == 2) {
            System.out.println("O mês é Fevereiro tem 28 dias");
        }else if (mes == 3) {
            System.out.println("O mês é Março tem 31 dias");
        }else if (mes == 4) {
            System.out.println("O mês é Abril tem 30 dias");
        }else if (mes == 5) {
            System.out.println("O mês é Maio tem 31 dias");
        }else if (mes == 6) {
            System.out.println("O mês é Junho tem 30 dias");
        }else if (mes == 7) {
            System.out.println("O mês é Julho tem 31 dias");
        }else if (mes == 8) {
            System.out.println("O mês é Agosto tem 31 dias");
        }else if (mes == 9) {
            System.out.println("O mês é Setembro tem 30 dias");
        }else if (mes == 10) {
            System.out.println("O mês é Outubro tem 31 dias");
        }else if (mes == 11) {
            System.out.println("O mês é Novembro tem 30 dias");
        }else if (mes == 12) {
            System.out.println("O mês é Dezembro tem 31 dias");

        }

    }
}
