package POO;

import java.lang.reflect.Constructor;

//classe Carro
public class Carro {
    // atributos da classe Carro
    String cor;
    String modelo;
    int capacidadeDoTanque;

    Carro (){

    }

    Carro (String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeTanque;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void setCapacidadeDoTanque(int capacidadeDoTanque){
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    int getCapacidadeDoTanque(){
        return capacidadeDoTanque;
    }

    public Double totalValorTanque(Double valorCombustivel){
        return capacidadeDoTanque * valorCombustivel;
    }

}
