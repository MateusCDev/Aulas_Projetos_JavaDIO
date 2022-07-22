package Projeto_BancoDigital;

public interface OperacoesBancarias {// Metodos de impresão e operações bancarias
     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor,Conta contaDestino);
     void imprimirExtrato();

}
