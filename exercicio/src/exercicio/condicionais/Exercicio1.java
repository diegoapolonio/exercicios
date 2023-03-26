package exercicio.condicionais;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[] args) {
        Scanner teclado=new Scanner (System.in);
        System.out.println("digie sua altura");
        float altura = teclado.nextFloat();
        System.out.println("digite seu peso");
        int peso = teclado.nextInt();

        float imc = altura/peso*altura;
        System.out.println("seu IMC É:"+imc);



    }
}
