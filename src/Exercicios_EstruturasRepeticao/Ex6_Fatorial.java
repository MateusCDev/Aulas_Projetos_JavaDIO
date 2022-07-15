package Exercicios_EstruturasRepeticao;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor;
        int total = 1;
        System.out.println("Digite o valor pra o resultado do fatorial: ");
        valor = scan.nextInt();

        for (int i = valor; i > 1; i--){
            total*=i;
        }
        System.out.println("O fatorial de: "+ valor + " é: "+ total);
    }
}

