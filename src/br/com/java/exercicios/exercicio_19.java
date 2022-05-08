package br.com.java.exercicios;

import java.util.Scanner;

/*19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0).*/
public class exercicio_19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// importando entrada de dados do usuário

        String nomeDoAluno;
        double nota1;
        double nota2;
        double media;//variáveis

        System.out.println("Insira o nome do Aluno: ");
        nomeDoAluno = scan.nextLine();//armazenando informação do usuário na variável

        System.out.println("Insira a Primeira nota: ");
        nota1 = scan.nextDouble();//armazenando informação do usuário na variável

        System.out.println("Insira a Segunda nota: ");
        nota2 = scan.nextDouble();//armazenando informação do usuário na variável

        media = (nota1 + nota2) / 2;// calcula a média


        if (media >= 7){//verifica se a média foi boa
            System.out.println("Você teve um bom aproveitamento!!");
        }
        else{
            System.out.println("Você Não teve um bom aproveitamento");
        }


    }
}
