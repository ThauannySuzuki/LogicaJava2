package exerciciosBasicos;
import java.util.Scanner;

public class EX30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o n mero de ma  s compradas:");
        int quantidade = scanner.nextInt();

        double precoUnitario;

        if (quantidade < 12) {
            precoUnitario = 0.50;
        } else {
            precoUnitario = 0.40;
        }

        double valorTotal = quantidade * precoUnitario;

        System.out.println("O valor total a ser pago  : R$" + valorTotal);

        scanner.close();
    }

}
