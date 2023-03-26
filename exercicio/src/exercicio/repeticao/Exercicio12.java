package exercicio.repeticao;

import java.util.Scanner;

public class Exercicio12 {
    /*1.  Escreva um programa Java que use um laço for para receber o nome e a idade de 10 pessoas e
    imprimir uma mensagem indicando se a pessoa é maior de idade ou não.
      for (int i=10; i<=99; i ++ )
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        for (int i=0; i<3; i ++) {
            System.out.println("Qual seu nome?");
            String nome = leitor.next();
            System.out.println("qual sua idade?");
            int idade = leitor.nextInt();
            if (idade>=18) {
                System.out.println( nome+" maior de idade.");
            }
        }
    }

}
