package exercicio.condicionais;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero1 = leitor.nextInt();
        System.out.println("Digite outro numero:");
        int numero2 = leitor.nextInt();
        System.out.println("Qual operação deseja ultilizar:");
        String operacao = leitor.next();

        int adicao = numero1 + numero2;
        int subtracao = numero1 -numero2;
        int divisao = numero1 / numero2;
        int multiplicacao = numero1 * numero2;

        switch (operacao){
            case "adicao":
                System.out.println("Resultado:\n"+adicao);
                break;
            case "subtracao":
                System.out.println("Resultado:\n"+subtracao);
                break;
            case "divisao":
                System.out.println("Resultado:\n"+divisao);
                break;
            case "multiplicacao":
                System.out.println("Resultado:\n"+multiplicacao);
                break;
         }
    }
}
