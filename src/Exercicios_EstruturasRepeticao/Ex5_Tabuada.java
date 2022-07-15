package Exercicios_EstruturasRepeticao;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor de 1 a 10 para a tabuada: ");
        valor = scan.nextInt();

        for (int i = 1; i <= 10; ++i){
            System.out.println("A tabuada de: "+valor+ " é: " + (valor*i));
        }
    }
}
