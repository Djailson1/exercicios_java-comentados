package br.com.java.exercicios;


import java.util.Scanner;

/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/


public class exercicio_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//para sinalizar entrada de dados pelo teclado.

        String nomeFunc;
        float salario;
        //variáveis

        System.out.println("Qual o nome do funcionário?");//pedindo o nome do funcionário.
        nomeFunc = scan.next();//ler a entrada do usuário e armazena o valor tipo string na variável funcionário.

        System.out.println("Qual é o salário do funcionário?");//pedindo o valor do salário do usuário.
        salario = scan.nextFloat();//ler a entrada do usuário e armazena o valor do salário na variável salario.

        System.out.println("O funcionário " + nomeFunc + ", tem um salário de " + salario + " reais, em dezembro.");//imprime na tela o nome do funcionário e o seu salário.

    }


}



