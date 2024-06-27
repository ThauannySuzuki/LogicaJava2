package exerciciosBasicos;
import java.util.Scanner;

//Escreva um programa que leia o preço de um produto e a quantidade comprada, e calcule o valor total a ser pago com desconto de 10% se a quantidade for maior que 10 unidades.
public class EX5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double preco = teclado.nextDouble();

        System.out.println("Digite a quantidade: ");
        double quant = teclado.nextDouble();

        double valor = preco*quant;

        if (quant>=10){
            double calculo = (10/100 * valor);

            System.out.println("O valor total foi: " + calculo );
        }
        else {
            System.out.println("O valor total foi: " + valor );

        }

    }
}
