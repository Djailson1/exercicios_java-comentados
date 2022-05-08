package br.com.java.exercicios;

import java.util.Scanner;

/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.*/
public class exercicio_12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double precoProduto = 0;
        double precoPromocao = 0;//variáveis

        System.out.println("Qual é o preço do produto? ");
        precoProduto = scan.nextDouble();// armazenando preço do produto informado pelo usuario na variável

        precoPromocao = (precoProduto * 0.05) - (precoProduto) ;//calculando desconto de 5%

        System.out.println("O preço com desconto de 5% é: " + precoPromocao + " reais.");//imprimindo o desconto na tela

    }
}
