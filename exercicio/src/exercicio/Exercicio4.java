package exercicio;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero:");
        int numero1 = leitor.nextInt();
        System.out.println("digite outro numero:");
        int numero2 = leitor.nextInt();
        int soma = numero1 + numero2;
        int resultado= soma;

        if (resultado>=0){
            System.out.println( "resultado é" + resultado);
        }

    }
}
