package br.com.java.exercicios;

import java.util.Scanner;

/*2) Faça um programa que leia o nome de uma pessoa
e mostre uma mensagem de boas vindas
para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/
public class exercicio_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;// variável que aramazena o nome informado da pessoa.

        System.out.println("Qual é o seu nome? ");//imprimindo a pergunta ao usuário
        nome = scan.nextLine();//variável que armazena o nome que o usuário irá informar.

        System.out.println("Olá, " + nome + " é um prazer te conhecer!!");// imprimindo na tela a mensagem de boas vindas juntamente com o nome informado

    }
}
