package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTest {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<>();

        for (int i=0; i<2; i++) {
            System.out.println("Digite seu nome: ");
            String nome = leitor.next();
            listaNomes.add(nome);
        }

        for (int i=0; i<listaNomes.size(); i++) {
            System.out.println("posicao: "+ i + " , nome: "+listaNomes.get(i));
        }
    }
}
