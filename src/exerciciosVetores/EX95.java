package exerciciosVetores;
import java.util.Scanner;

public class EX95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];

        System.out.println("Digite 5 nomes:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }


        System.out.println("Nomes em ordem alfab tica:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }


}
