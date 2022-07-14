package Exercicios_Variaveis;

public class exercicio3 {
    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmetico");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
    }

    private static void prePos(){

        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;
        System.out.println("i " + i);
        System.out.println("j " + j);
        System.out.println("x " + x);
    }

    private  static void  aritmetico(){

        int a = 10;
        int b = 10;

        int soma = a+b;
        int sub = a-b;
        int mult = a*b;
        int div = a/b;
        int mod = a%b;

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
        System.out.println("Resultado do resto: " + mod);
    }
    private  static void atribuicao(){

        int num1 = 5;
        int num2 = 10;

        num1 =  num2;
        num1 += num2;
        num1 -= num2;
        num1 *= num2;
        num1 /= num2;
        num1 %= num2;

        System.out.println(num1);
    }
}
