package exerciciosBasicos;
import java.util.Scanner;
//Faça um programa que receba três notas de um aluno e exiba se ele foi aprovado ou reprovado. A média para aprovação é 7.
public class EX19 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite a nota 1");
        double nota1 = leitura.nextDouble();

        System.out.println("Digite a nota 2");
        double nota2 = leitura.nextDouble();

        System.out.println("Digite a nota 3");
        double nota3 = leitura.nextDouble();

        double media = (nota1+nota2+nota3) / 3;

        if (media >= 7){
            System.out.println("O aluno foi APROVADO " + media);
        }
        else {
            System.out.println("O aluno foi REPROVADO " + media);
        }

    }
}
