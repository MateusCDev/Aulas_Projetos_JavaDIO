package Exercicios_EstruturasRepeticao;

import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite sua nota de 1 a 10:");
        int nota = dados.nextInt();

        boolean validador = true;

        while(validador){
            if(nota >=0 && nota <=10){
                System.out.println(nota);
                validador=false;
            }else{
                System.out.println("Numero invalido digite novamente");
                nota=dados.nextInt();
            }
        }

    }
}
