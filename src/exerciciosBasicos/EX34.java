package exerciciosBasicos;
import java.util.Scanner;

public class EX34 {

    public class MaiorIdade {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o n mero de pessoas no grupo: ");
            int numeroPessoas = scanner.nextInt();

            int menoresIdade = 0;
            int maioresIdade = 0;

            for (int i = 1; i <= numeroPessoas; i++) {
                System.out.print("Digite a idade da pessoa " + i + ": ");
                int idade = scanner.nextInt();

                if (idade < 18) {
                    menoresIdade++;
                } else {
                    maioresIdade++;
                }
            }

            System.out.println("N mero de pessoas menores de idade: " + menoresIdade);
            System.out.println("N mero de pessoas maiores de idade: " + maioresIdade);

            scanner.close();
        }
    }
}