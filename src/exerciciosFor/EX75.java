package exerciciosFor;

public class EX75 {
    public static void main(String[] args) {
        //Fa a um programa que exiba os primeiros 20 n meros da sequ ncia de Fibonacci.

        int limite = 20;
        System.out.println("Os primeiros " + limite + " n meros da sequ ncia de Fibonacci s o:");

        int anterior = 0;
        int atual = 1;
        System.out.print(anterior + " " + atual + " ");

        for (int i = 3; i <= limite; i++) {
            int proximo = anterior + atual;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;
        }
    }

}
