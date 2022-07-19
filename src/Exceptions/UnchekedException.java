package Exceptions;

import javax.swing.*;

public class UnchekedException {
    public static void main(String[] args) {
        boolean continueLoop = true;
        do{
            String a = JOptionPane.showInputDialog("Nuumerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try{// bloco que pega o local que esta o erro e inicia o tratamento
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: "+ resultado);
                continueLoop = false;
            } catch (NumberFormatException e) {// parte que aplica o tratamento da exeption
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Entrada Invalida, Informe um numero inteiro! "+ e.getMessage());
            }catch (ArithmeticException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Impossivel divir um numero por 0. "+ e.getMessage());
            }
            finally {//  independente se o programa der ou não uma exception ele ira rodar
                System.out.println("Chegou no finally!");
            }

        }while (continueLoop);

    }
    public static int dividir( int a, int b ) {
        return (a / b);
    }
}
