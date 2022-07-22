package Projeto_BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente nome = new Cliente();
        nome.setNome("Mateus");
        Conta cc = new ContaCorrente(nome);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(nome);
        cc.transferir(100,cp);
        Banco lista = new Banco();


        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
