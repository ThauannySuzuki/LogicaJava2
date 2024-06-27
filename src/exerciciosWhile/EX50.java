package exerciciosWhile;
import java.util.Scanner;
public class EX50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalIdades = 0;
        int contador = 0;


        while (true) {
            System.out.println("Digite o nome da pessoa (ou 'fim' para encerrar):");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Digite a idade de " + nome + ":");
            int idade = scanner.nextInt();
            scanner.nextLine();

            totalIdades += idade;
            contador++;
        }

        if (contador == 0) {
            System.out.println("Nenhuma idade foi inserida.");
        } else {

            double media = (double) totalIdades / contador;

            System.out.println("A m dia das idades das pessoas  : " + media);
        }

        scanner.close();
    }
}
