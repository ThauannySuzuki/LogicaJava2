package exercicioMatriz;
import java.util.Scanner;

public class EX110gloriaaDeus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizSubtracao = new int[2][2];

        // Leitura da primeira matriz
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        lerMatriz(scanner, matriz1);

        // Leitura da segunda matriz
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        lerMatriz(scanner, matriz2);

        // Calcular a subtra  o das matrizes
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrizSubtracao[i][j] = matriz1[i][j] - matriz2[i][j];
            }
        }

        // Exibir a subtra  o das matrizes
        System.out.println("Matriz subtra  o:");
        exibirMatriz(matrizSubtracao);

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

    // M todo para exibir uma matriz 2x2
    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula para a pr xima linha ap s cada linha da matriz
        }
    }















}
