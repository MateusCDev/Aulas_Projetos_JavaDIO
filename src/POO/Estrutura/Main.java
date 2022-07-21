package POO.Estrutura;

import POO.Estrutura.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();// Criação do objeto  tipando ele com a sua classe e instanciando um constructor
        carro.setCor("Azul"); // insere os valores nos atributos usando set
        carro.setModelo("Honda - City");
        carro.setCapacidadeDoTanque(20);

        // Recebe esses valores e imprime usando  System.out e  get
        System.out.println("A cor do carro é: " + carro.getCor() + ", o modelo dele é: " + carro.getModelo() +
                " e a capacidade do tanque é: " + carro.getCapacidadeDoTanque());

        // chama o metodo do objeto
        System.out.println("O valor total para encher seu tanque é: R$" + carro.totalValorTanque(5.5));

        //Causando uma sobrecarga no construtor do objeto Carro passando os parametros de valor ja na instancia
        Carro carro1 = new Carro("Preto","Gol",50);
        System.out.println("A cor do carro é :"+carro1.getCor());
        System.out.println("O modelo do carro é: "+carro1.getModelo());
        System.out.println("A capacidade do tanque do carro é: "+carro1.getCapacidadeDoTanque());
        System.out.println("O valor para encher o tanque do carro é: R$"+carro1.totalValorTanque(7.70));
    }

}
