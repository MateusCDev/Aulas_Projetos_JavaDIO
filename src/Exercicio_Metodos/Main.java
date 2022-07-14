package Exercicio_Metodos;

public class Main {
    public static void main(String[] args) {
        int val1=10;
        int val2=3;

        //Chamando metodos por uma classe dentro da class main
        Calculadora.soma(val1,val2);
        Calculadora.subtracao(val1,val2);
        Calculadora.multiplicacao(val1,val2);
        Calculadora.divisao(val1,val2);

        //Sobrecarga no metodo area pasando diferentes parametros e retornando o valor em double
        System.out.println("A area do quadrado é: "+Quadrilateros.area(5));
        System.out.println("A area do retangulo é: "+Quadrilateros.area(5,10));
        System.out.println("A area do trapezio é: "+Quadrilateros.area(10,5,20));
    }

}
