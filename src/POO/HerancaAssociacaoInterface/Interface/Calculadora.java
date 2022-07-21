package POO.HerancaAssociacaoInterface.Interface;

public class Calculadora  implements  OperacaoMatematica{
    public static void main(String[] args) {
        System.out.println(OperacaoMatematica.soma(10,2));
        System.out.println(OperacaoMatematica.subtracao(10,2));
        System.out.println(OperacaoMatematica.multplicacao(10d,2d));
        System.out.println(OperacaoMatematica.divisao(10d,2d));
    }
}
