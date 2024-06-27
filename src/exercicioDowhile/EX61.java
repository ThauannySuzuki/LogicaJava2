package exercicioDowhile;
import java.util.Scanner;
public class EX61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um n mero inteiro:");
        int numero = scanner.nextInt();

        int soma = 0;
        int contador = 2;

        do {
            soma += contador; // Adiciona o n mero par   soma
            contador += 2; // Incrementa o contador para passar para o pr ximo n mero par
        } while (contador <= numero);

        System.out.println("A soma dos n meros pares entre 1 e " + numero + "  : " + soma);

        scanner.close();
    }


}
