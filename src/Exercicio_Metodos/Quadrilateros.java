package Exercicio_Metodos;

public class Quadrilateros {
    //Sobrecarga no metodo area pasando diferentes parametros
    public static double area(double lado){
        return lado * lado;
    }
    public static double area(double a, double b){
        return a * b;
    }
    public static double area(double b1, double b2, double alt){
        return  ((b1+b2)/2) * alt;
    }
}
