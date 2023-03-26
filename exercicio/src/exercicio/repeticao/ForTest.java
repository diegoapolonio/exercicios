package exercicio.repeticao;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        for(int i=0; i<2; i++) {
            String nome = leitor.next();
            System.out.println("Bem vindo " + nome + "sua posição é " + i);
        }

    }
}
