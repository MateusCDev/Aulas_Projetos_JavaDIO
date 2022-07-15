package Exercicios_EstruturasRepeticao;

import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int contador = 0;
        int numero;
        int pares= 0;
        int impares=0;

        System.out.println("Digite a quantidade de numeros: ");
        qtdNumeros= scan.nextInt();

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if((numero % 2)== 0){
                pares++;
            }else{
                impares++;
            }
            contador++;
        }while (contador < qtdNumeros);
        System.out.println("A quantidade de numeros pares é: "+ pares);
        System.out.println("A quantidade de numeros impares é: "+ impares);
    }
}
