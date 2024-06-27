package exercicioDowhile;
import java.util.Scanner;
public class EX55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero para ver sua tabuada:");
        int numero = scanner.nextInt();

        int contador = 1;

        System.out.println("Tabuada do n mero " + numero + ":");

        do {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        } while (contador <= 10);

        scanner.close();
    }

}
