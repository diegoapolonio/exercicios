package exercicio.condicionais;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = leitor.next();

        switch (nome) {
            case "Robson":
                System.out.println("Digite sua idade");
                int idade = leitor.nextInt();
                System.out.println("Bem vindo robson, sua idade é " + idade);
                break;
            case "Diego":
                System.out.println("Digite seu codigo dee segurança:");
                int codigo = leitor.nextInt();
                if (codigo == 123) {
                    System.out.println("Codigo valido");
                    System.out.println("Bem vindo diego");
                } else {
                    System.out.println( "Codigo invalido");
                }
                break;
            default:
                System.out.println("Nenhum nome encontrado");
        }

    }
}
