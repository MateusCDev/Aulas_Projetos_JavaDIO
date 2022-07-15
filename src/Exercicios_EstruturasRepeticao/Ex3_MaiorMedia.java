package Exercicios_EstruturasRepeticao;

import java.util.Scanner;

public class Ex3_MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double media;
        int maior = 0;
        int numero;
        int contador = 0;
        int total=0;

        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();
            if(numero>maior){
                maior = numero;
            }
            total+=numero;
            contador++;
        }while(contador < 5);

        media = total/5;
        System.out.println(" A media dos valores é : "+ media);
        System.out.println("O maior numero é: "+ maior);
    }
}
