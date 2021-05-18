/* Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
O código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
*/

package lista2_URI;

import java.util.Scanner;

public class exercicio1010 {
        
        public static void main(String[] args) { 
            
        Scanner leitor = new Scanner(System.in);

            
        int cod1, cod2, quant1, quant2;

        double valor1, valor2, total;

        System.out.print("Código da primeira peça: ");
         cod1 = leitor.nextInt();

        System.out.print("Quantidade da primeira peça: ");
         quant1 = leitor.nextInt();
         
        System.out.print("Valor unitário da primeira peça = R$");
         valor1 = leitor.nextDouble();
          
        System.out.print("Código da segunda peça: ");
         cod2 = leitor.nextInt();

        System.out.print("Quantidade da segunda peça: ");
         quant2 = leitor.nextInt();
         
        System.out.print("Valor unitário da segunda peça = R$");
          valor2 = leitor.nextDouble();
            
          total = (quant1 * valor1) + (quant2 * valor2 );
        
          System.out.println("Peças utilizadas: " + cod1 + " e " + cod2);

          System.out.println("Valor total a pagar = R$" + total);

          leitor.close();

   }
}

