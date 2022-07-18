package Exercicios_EstruturasRepeticao;

public class Ex7_OrdemInversa {
    public static void main(String[] args) {

        int [] vetor = {0,1,2,3,4,5};
        int contador = 0;

        while(contador <= (vetor.length-1)){
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        System.out.println("\n");
        for(int i  = (vetor.length-1);i >= 0; i --){
            System.out.print(vetor[i] + " ");
        }
    }
}
