package exerciciosBasicos;
import java.util.Scanner;

public class EX31 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o sal rio atual do funcion rio: R$");
        double salarioAtual = scanner.nextDouble();

        double novoSalario = salarioAtual * 1.15;

        System.out.println("O novo sal rio do funcion rio, com aumento de 15%,  : R$" + novoSalario);

        scanner.close();
    }

}
