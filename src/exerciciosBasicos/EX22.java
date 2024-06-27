package exerciciosBasicos;
import java.util.Scanner;
//Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus. Se o salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.
public class EX22 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = leitura.nextDouble();

        if (salario >= 2000){
            System.out.println("O seu bônus é de 10%");
        }else {
            System.out.println("Seu bônus é de 5%");
        }
    }
}
