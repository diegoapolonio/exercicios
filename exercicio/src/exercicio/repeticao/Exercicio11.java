package exercicio.repeticao;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        /*faça um programa para receber o nome de uma pessoa ,
         e a quantidade de documentos que ela tem, para cada
         documento pergunte o tipo do documento e o numero.
         for (int i=10; i<=99; i ++ )
         */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Olá,Qual seu nome?");
        String nome = leitor.next();
        System.out.println("Qual a quantidade de documentos?");
        int documento = leitor.nextInt();

        for (int i=0; i<documento; i++) {
            System.out.println("qual tipo de documento?");
            String tipodoc = leitor.next();
            System.out.println("digite o numero do documento?");
            int numerodoc = leitor.nextInt();
            System.out.println("cadastro realizado com sucesso!\n"+"Nome:"+ nome + "\n" +"TipoDoc:"+ tipodoc+"\n" +"Numero:"+ numerodoc);
        }

    }

/*
*   qual seu nome? "robosn"
*   quantos documentos? 2
*
*   quanto o tipo do 1 documento? cpf
*   qual o numero do documento 1? 132
*   documento cpf cadastrado com sucesso
*
*   quanto o tipo do 2 documento? rg
*   qual o numero do documento 2? 1234
*   document rg cadastrado com sucesso
* */

}

