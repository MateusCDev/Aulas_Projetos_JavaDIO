package POO.HerancaAssociacaoInterface.Interface;

public interface OperacaoMatematica {

     static int soma(int valor1,int valor2){
     return valor1+ valor2;
    }
    static int subtracao(int valor1,int valor2){
     return valor1 - valor2;
    }
    static double multplicacao(double valor1, double valor2){
     return valor1 * valor2;
    }
    static double divisao(double valor1,double valor2){
     return valor1 / valor2;
    }
}
