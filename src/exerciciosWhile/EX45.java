package exerciciosWhile;

public class EX45 {
    public static void main(String[] args) {
        int primeiroNumero = 0;
        int segundoNumero = 1;
        int contador = 0;

        System.out.println("Os primeiros 20 n meros da sequ ncia de Fibonacci:");

        while (contador < 20) {
            System.out.print(primeiroNumero + " ");

            int proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;

            contador++;
        }
    }


}
