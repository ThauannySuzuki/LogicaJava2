package exerciciosVetores;
import java.util.Scanner;
public class EX81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o n mero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Os n meros na ordem inversa s o:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }


}
