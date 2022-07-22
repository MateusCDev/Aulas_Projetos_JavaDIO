package Projeto_BancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente nome = new Cliente();// Cria o cliente
        nome.setNome("Mateus");//Insere o nome
        Conta cc = new ContaCorrente(nome);//Cria a conta corrente
        cc.depositar(100);//Deposita um valor
        Conta cp = new ContaPoupanca(nome);// Cria a conta poupança
        cc.transferir(100,cp);// Transfere o valor da conta corrente para a poupança


        // Imprime o extrato de ambas contas
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
