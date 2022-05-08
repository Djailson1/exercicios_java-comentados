package br.com.java.exercicios;

import java.util.Scanner;

/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.*/
public class exercicio_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//importando pacote de entrada de dados do usuário

        double salarioFuncionario;
        double salarioComAumento;//variáveis

        System.out.println("Digite o salário do funcionário: ");
        salarioFuncionario = scan.nextDouble();//armazenando salario informado pelo usuario

        salarioComAumento = (salarioFuncionario * 0.15) + (salarioFuncionario);

        System.out.println(" O salário com aumento é de R$ " + salarioComAumento + " reais.");//imprimindo o novo salário



    }
}
