package exercicio.condicionais;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite seu nome:");
        String nome = leitor.next();

        switch (nome){
            case "diego":
                System.out.println("digite seu codigo:");
                int codigo = leitor.nextInt();
                System.out.println("digite o nome do seu pai:");
                String pai = leitor.next();


                if (codigo==123 && pai.equals("robson")){
                    System.out.println("bem vindo");
                }
                else {
                    System.out.println("dados invalidos");
                }

        }

    }
}
