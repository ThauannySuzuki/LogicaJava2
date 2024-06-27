package exerciciosBasicos;

import java.util.Scanner;

//Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
public class EX20 {
            public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);


                int par =0;
                int impar = 0;


                for (int n=1; n<=10; n++){

                    System.out.println("Digite um número:");
                    int numero = teclado.nextInt();

                    if (numero%2 == 0){
                        System.out.println(numero + " O numero é PAR");
                        par = par +1;
                    }else {
                        System.out.println(numero + " O numero é IMPAR");
                        impar = impar + 1;
                    }
                }

                System.out.println(" Numeros pares: " + par);
                System.out.println(" Numeros impares: " + impar);

            }
        }


