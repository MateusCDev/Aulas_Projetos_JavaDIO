package Exercicios_Variaveis;

public class exercicio1 {
    public static void main(String[] args) {
        int i;
        int I;
        int _1a; //Não é uma boa pratica
        int $aq; //Não é uma boa pratica
        int quantidadeProduto = 50; // É uma boa pratica
        final int NUMERO_TENTATIVAS = 5; // É uma boa pratica

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; //uma constante sendo assim o valor dado a variavel não pode mudar


        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(j);

    }
}
