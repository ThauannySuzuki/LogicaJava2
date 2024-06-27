package exerciciosVetores;
import java.util.Scanner;

public class EX92 {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] numeros = new int[5];

    System.out.println("Digite 5 n meros inteiros:");

    for (int i = 0; i < numeros.length; i++) {
        System.out.print("N mero " + (i + 1) + ": ");
        numeros[i] = scanner.nextInt();
    }

    for (int i = 0; i < numeros.length - 1; i++) {
        int indiceMaior = i;
        for (int j = i + 1; j < numeros.length; j++) {
            if (numeros[j] > numeros[indiceMaior]) {
                indiceMaior = j;
            }
        }

        int temp = numeros[i];
        numeros[i] = numeros[indiceMaior];
        numeros[indiceMaior] = temp;
    }

    System.out.println("N meros em ordem decrescente:");
    for (int numero : numeros) {
        System.out.println(numero);
    }

    scanner.close();
}

}
