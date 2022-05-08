package br.com.java.exercicios;


import java.util.Scanner;

/*20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR.*/
public class exercicio_20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//armazenando informação do usuário na variável

        int numero;//variável

        System.out.println("Digite um número: ");
        numero = scan.nextInt();//armazenando informação do usuário na variável

        if (numero % 2 == 0) {//condição validando se é par
            System.out.println("È par!!");
        }else{//se não for par é i,par
            System.out.println("È impar!!");
        }

    }
}
