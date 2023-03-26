package exercicio.condicionais;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Bem vindo a academia Dragon!");
        System.out.println("digite seu nome:");
        String usuario = leitor.next();
        System.out.println("digite sua senha:");
        int senha = leitor.nextInt();

        if (usuario.equalsIgnoreCase("diego") && senha == 123) {
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("senha invalida");
        }
    }
}