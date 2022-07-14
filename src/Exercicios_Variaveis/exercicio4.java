package Exercicios_Variaveis;

public class exercicio4 {
    public static void main(String[] args) {
        //conversão de forma explicita Downcasting ( pode haver perca de dados)
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

        //conversão de forma inplicita Upcasting
        long l1;
        int i1 = 10;
        l1 = i1;

        //Truncamento de valores tranforma um dado float para inteiro se perde o valor fracionado
        int i;
        float f = 1.5f;
        i = (int)f;

        System.out.println(b1);
        System.out.println(l1);
        System.out.println(i);
    }
}
