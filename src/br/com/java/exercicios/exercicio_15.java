package br.com.java.exercicios;

import java.util.Scanner;

/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.*/
public class exercicio_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);// importando entrada de dados do usuário

        double diasTrabalhadoMes;
        double horasTrabalhadasPorDia = 8;
        double valorGanhoPorHoraTrabalhada = 25.00;//variáveis

        System.out.println("Insira a quantidade de dias trabalhados no mês: ");
        diasTrabalhadoMes = scan.nextDouble();//armazenando informação do usuário na variável

        diasTrabalhadoMes = diasTrabalhadoMes * (horasTrabalhadasPorDia * valorGanhoPorHoraTrabalhada);// cálculo do total do valor ganho por hora trabalhada



        System.out.println(" O salário do funcionário é de: " + diasTrabalhadoMes + " reais.");//imprimindo resultado na tela

    }
}
