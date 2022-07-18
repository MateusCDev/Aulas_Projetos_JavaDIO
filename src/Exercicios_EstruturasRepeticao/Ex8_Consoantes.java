package Exercicios_EstruturasRepeticao;

import java.util.Scanner;

public class Ex8_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeConsoantes =0;
        int contador =0;
        do{
            System.out.println("Digite uma letra: ");
            String letra = scan.next();
        //Se  não for igual as vogais intera as letras dentro do array
            if( !(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u")) ){
                consoantes[contador]=letra;
                quantidadeConsoantes++;
            }
            contador++;
        }while(contador < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if (consoante != null) { // se for diferente de null so mostra as consoantes
                System.out.print(consoante + " ");
            }
        }
        System.out.print("Quantidade de consoantes: " +quantidadeConsoantes + " ");
    }
}
