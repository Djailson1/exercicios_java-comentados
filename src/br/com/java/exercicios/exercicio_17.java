package br.com.java.exercicios;

import java.util.Scanner;

/*PASSO 02 - CONDIÇÕES BÁSICAS
17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.*/
public class exercicio_17 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);// importando entrada de dados do usuário

        int vel = 0, velAcima, valMulta, multaKm;//variáveis

        valMulta = vel - 80;// calculo para capturar cada excesso de multa
        multaKm = valMulta * 5;//calculo cada km ultrapassado a 5 reais

        System.out.println("Qual a velocidade do carro?");
        vel = scan.nextInt();//armazenando informação do usuário na variável

        if (vel > 80){//condição para capturar excesso de velocidade
            System.out.println("Você foi multado!");
            System.out.println("Multa no valor de R$ " + multaKm);//valor da multa
        }

    }
}
