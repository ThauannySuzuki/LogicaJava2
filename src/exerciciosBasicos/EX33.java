package exerciciosBasicos;
import java.util.Scanner;

public class EX33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        System.out.println("Digite o turno do aluno (M para matutino, V para vespertino):");
        char turno = scanner.next().charAt(0);

        String saudacao = "";
        if (turno == 'M') {
            saudacao = "Bom dia, " + nome + "!";
        } else if (turno == 'V') {
            saudacao = "Boa tarde, " + nome + "!";
        } else {
            saudacao = "Turno inv lido!";
        }

        System.out.println(saudacao);

        scanner.close();
    }


}
