package exerciciosWhile;
import java.util.Scanner;
public class EX40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero para ver a tabuada:");
        int numero = scanner.nextInt();

        int contador = 1;

        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }

        scanner.close();
    }

}
