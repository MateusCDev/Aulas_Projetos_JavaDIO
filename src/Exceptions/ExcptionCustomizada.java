package Exceptions;

import javax.swing.*;

public class ExcptionCustomizada {
    public static void main(String[] args) {
        int[] numerador ={4,8,8,10};
        int[] denominador ={2,4,2,2,8};
        for(int i =0; i < denominador.length; i++){
            try{
                if(numerador[i]%2 != 0)
                    throw  new DivisaoNaoExataException("Divisão não exata! ", numerador[i], denominador[i]);
                int resultado  = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,e.getMessage());
            }catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossivel divir um numero por 0. "+ e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Tamanho do array insuficiente para o calculo "+ e.getMessage());
            }

        }
            System.out.println("O programa continua ...");
    }
}
