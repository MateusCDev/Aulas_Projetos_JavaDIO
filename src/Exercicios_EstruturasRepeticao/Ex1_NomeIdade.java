package Exercicios_EstruturasRepeticao;
import java.util.Scanner;

public class Ex1_NomeIdade {
    public static void main(String[] args) {
        //Exercicio While 1
        int idade;
        String nome;

        Scanner dados = new Scanner(System.in);
        System.out.println("Digite 1 para inciar e 0 para interromper");
        int seletor = dados.nextInt();

        while(seletor == 1){
            System.out.println("Digite o seu nome: ");
            nome = dados.next();
            System.out.println("Digite a sua idade: ");
            idade = dados.nextInt();
            System.out.println("Seu nome é : "+ nome +" e sua idade é: " + idade);
            System.out.println("Digite 1 para reiniciar e 0 para interromper");
            seletor = dados.nextInt();
        }


    }
}
