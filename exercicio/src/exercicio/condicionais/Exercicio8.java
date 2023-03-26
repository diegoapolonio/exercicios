package exercicio.condicionais;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor =new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String pessoa = leitor.next();
        System.out.println("qual seu animal favorito?");
        String animal = leitor.next();

        switch (animal){
            case "gato":
                System.out.println("Qual a idade se seu gato?");
                int idade = leitor.nextInt();
                System.out.println("Qual o nome do seu gato");
                String nome = leitor.next();
                if (idade>=5){
                    System.out.println("cuide bem de seu gato");
                }
                break;
            case "cachorro":
                System.out.println("qual a raca de seu cachorro?");
                String raca = leitor.next();
                if (raca.equals("petbull")){
                    System.out.println("Cuidado raca perigosa");
                }
                break;
            default:
                System.out.println("animal nao registrado");
                }
        }

    }

