package exercicio;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero1 = leitor.nextInt();
        System.out.println("Digite outro numero:");
        int numero2 = leitor.nextInt();
        System.out.println("Qual operacao que realizar ente ambos?");
        String operacao = leitor.next();

        int divisao = numero1 /numero2;
        int adicao = numero1 + numero2;
        int multiplicacao = numero1 * numero2;
        int subtracao = numero1 - numero2;

        if (operacao.equals("adicao")){
            System.out.println("resultado\n" +adicao);
        }

        if(operacao.equals("divisao")){
            System.out.println("resultado\n" +divisao);
        }

        if (operacao.equals("multiplicacao")){
            System.out.println("resultado\n"+multiplicacao);
        }

        if (operacao.equals("subtracao")){
            System.out.println("resultado\n" +subtracao);
        }

    }
}
