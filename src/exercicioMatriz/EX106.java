package exercicioMatriz;
import java.util.Scanner;

public class EX106 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];

        // Leitura da primeira matriz
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        lerMatriz(scanner, matriz1);

        // Leitura da segunda matriz
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        lerMatriz(scanner, matriz2);

        // Verificar se as matrizes s o iguais
        boolean iguais = true;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    iguais = false;
                    break;
                }
            }
            if (!iguais) {
                break;
            }
        }

        if (iguais) {
            System.out.println("As matrizes s o iguais.");
        } else {
            System.out.println("As matrizes n o s o iguais.");
        }

        scanner.close();
    }

    // M todo para ler uma matriz 2x2
    public static void lerMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

}
