package exercicio.condicionais;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println(" Olá,digite um numero:");
        int numero1 = leitor.nextInt();
        System.out.println("Olá,digite outro numero:");
        int numero2 = leitor.nextInt();

        if (numero1 > numero2){
            System.out.println("valor maior"+ numero1);
        }
        if (numero2 > numero1){
            System.out.println("valor maior"+ numero2);
        }
        if ( numero1==numero2){
            System.out.println("numeros iquais,comece outra vez!");
        }

    }
}
