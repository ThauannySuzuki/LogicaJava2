package exerciciosBasicos;
import java.util.Scanner;
//Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.
public class EX15 {
    public static void main(String[] args) {
          Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o valor do seu salário: ");
        double valor = leitura.nextDouble();


        double salario = (double) 15 / 100 * valor;

        double SalarioFinal = salario+valor;

        System.out.println("O valor do seu salário é: " + SalarioFinal);

    }
}
