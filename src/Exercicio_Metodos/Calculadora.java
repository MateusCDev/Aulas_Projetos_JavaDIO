package Exercicio_Metodos;

public class Calculadora {
    public static void  soma(int val1, int val2){
        int resultado = val1 + val2;
        System.out.println("O resultado de  " + val1 + "+" + val2 + " é: " + resultado) ;
    }
    public static void  subtracao(int val1, int val2){
        int resultado = val1 - val2;
        System.out.println("O resultado de  " + val1 + "-" + val2 + " é: " + resultado) ;
    }
    public static void  multiplicacao(int val1, int val2){
        long resultado = val1 * val2;
        System.out.println("O resultado de  " + val1 +"*" + val2 + " é: " + resultado) ;
    }
    public static void  divisao(float val1, float val2){
        float resultado = val1 / val2;
        System.out.println("O resultado de  " + val1 + "/" + val2 + " é: " + resultado) ;
    }
}
