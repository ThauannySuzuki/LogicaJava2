package exerciciosBasicos;
import java.util.Scanner;
//) Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor total a ser pago. Considere que cada produto tem um preço diferente.
public class EX26 {
    public static void main(String[] args) {

        int[] codigos = {1, 2, 3};
        double[] precos = {10.0, 20.0, 30.0};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o c digo do produto:");
        int codigoProduto = scanner.nextInt();

        int indiceProduto = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigoProduto) {
                indiceProduto = i;
                break;
            }
        }

        if (indiceProduto == -1) {
            System.out.println("C digo de produto inv lido.");
            return;
        }

        System.out.println("Digite a quantidade comprada:");
        int quantidade = scanner.nextInt();

        double valorTotal = precos[indiceProduto] * quantidade;

        System.out.println("O valor total a ser pago  : R$" + valorTotal);

        scanner.close();
    }

}
