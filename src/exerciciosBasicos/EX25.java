package exerciciosBasicos;

import java.util.Scanner;

//) Faça um programa que leia o número de faltas de um aluno em uma disciplina e exiba sua situação. Se o número de faltas for maior que 15, ele é reprovado por falta.
public class EX25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de faltas do aluno:");
        int faltas = scanner.nextInt();

        if (faltas > 15) {
            System.out.println("O aluno esta reprovado por falta.");
        } else {
            System.out.println("O aluno esta aprovado.");
        }

        scanner.close();
    }
}
