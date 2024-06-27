package exerciciosBasicos;
import java.util.Scanner;
//Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade e quantas são maiores de idade.
public class EX21 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int maiores =0;
        int menores = 0;


        for (int n=1; n<=10; n++){

            System.out.println("Digite um número:");
            int idade = leitura.nextInt();

            if (idade<=17){
                System.out.println(idade + " anos é MENOR de idade");
                menores = menores +1;
            }else {
                System.out.println(idade + " anos é MAIOR de idade");
                maiores = maiores + 1;
            }
        }

        System.out.println("Maiores de idade: " + maiores);
        System.out.println("Menores de idade: " + menores);

    }
}
