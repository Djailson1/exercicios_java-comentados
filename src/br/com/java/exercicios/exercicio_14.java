package br.com.java.exercicios;

import java.util.Scanner;

/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.*/
public class exercicio_14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// importando entrada de dados do usuário

        double quantKm;
        double diasAlugado;
        double precoTotal;//variáveis


        System.out.println("Informe a quantidade de quilômetros: ");
        quantKm = scan.nextDouble();//armazenando informação do usuário na variável

        System.out.println("Informe a quantidade de dias que o carro foi alugado: ");
        diasAlugado = scan.nextDouble();//armazenando informação do usuário na variável

        quantKm = quantKm * 0.20;//calculo do(s) quilometros percorridos
        diasAlugado = diasAlugado * 90.00;//calculo do(s) dia(s) do aluguel

        precoTotal = quantKm + diasAlugado;// calculo do total

        System.out.println("O total a receber pelo aluguel do carro: " + precoTotal + " reais.");//imprimindo o valor total na tela

    }
}
