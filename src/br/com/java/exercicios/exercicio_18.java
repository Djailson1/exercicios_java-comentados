package br.com.java.exercicios;

import java.util.Scanner;

/*18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar.*/
public class exercicio_18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// importando entrada de dados do usuário

        int anoNascimento;
        int idade;//variáveis

        System.out.println("Insira o ano de nascimento: ");
        anoNascimento = scan.nextInt();//armazenando informação do usuário na variável

        idade = 2022 - anoNascimento;// calcula idade

        System.out.println("Você tem " + idade + " anos.");

        if (idade >= 16) {// condição para validar idade para votação
            System.out.println("Poderá votar esse ano!!");
        } else {
            System.out.println("Você não tem a idade necessária para votar!!");

        }



    }
}
