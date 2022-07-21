package POO.HerancaAssociacaoInterface.Heranca;

public class Main {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[]{new Vendedor(),new Faxineiro(), new Gerente() , new Funcionario()};

        //Polimorfismo com sobrescrita
        for(Funcionario funcionario: funcionarios){
            funcionario.metodo1();
        }
        System.out.println("");
        for (Funcionario funcionario: funcionarios){
            funcionario.metodo2();
        }
        System.out.println("");

        //Sobrescrita Pura
        Faxineiro faxineiro = new Faxineiro();
        faxineiro.metodo2();

    }
}
