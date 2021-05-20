/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
    Codigo              Epecificação            Preço
      1                 Cachorro quente         R$4.00
      2                 X-salada                R$4.50 
      3                 X-Bacon                 R$5.00
      4                 Torrada Simples         R$2.00
      5                 Refrigerante            R$1.50
*/
package Lista4_URI;

import java.util.Scanner;

public class exercicio1038 {

    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);

        int cod, quant;

        double valor;

        System.out.print("Codigo: ");
        cod = leitor.nextInt();

        System.out.print("Quantidade: ");
        quant = leitor.nextInt();

            if (cod == 1) {
                valor = quant * 4.00;
                System.out.println("Valor = " +  valor);

            } else if (cod == 2) {
                valor = quant * 4.50;
                System.out.println("Valor = " +  valor);

            } else if (cod == 3) {
                valor = quant * 5.00;
                System.out.println("Valor = " +  valor);

            } else if (cod == 4) {
                valor = quant * 2.00;
                System.out.println("Valor = " +  valor);
            
            } else if (cod == 5) {
                valor = quant * 1.50;
                System.out.println("Valor = " +  valor);
            
            } else {
            System.out.println("Codigo invalido");
            }
            leitor.close();
    }
}
