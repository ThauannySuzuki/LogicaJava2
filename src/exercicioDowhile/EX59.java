package exercicioDowhile;
import java.util.Scanner;

public class EX59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 5;
        int contador = 0;
        int somaIdades = 0;

        do {
            System.out.println("Digite o nome da pessoa " + (contador + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade da pessoa " + (contador + 1) + ":");
            int idade = scanner.nextInt();
            scanner.nextLine();

            somaIdades += idade;
            contador++;
        } while (contador < totalPessoas);

        double media = (double) somaIdades / totalPessoas;

        System.out.println("A m dia das idades das 5 pessoas  : " + media);

        scanner.close();
    }


}
