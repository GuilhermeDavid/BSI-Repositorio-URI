/* Leia 2 valores inteiros e armazene-os nas variáveis A e B.
Efetue a soma de A e B atribuindo o seu resultado na variável X. 
Imprima X.
*/
package lista2_URI;

import java.util.Scanner;

public class exercicio1001 {
    
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in); 

        int a, b, X;

        System.out.print("A = ");
         a = leitor.nextInt();
 
         System.out.print("B = ");
          b = leitor.nextInt();

        X = a + b;
        
        System.out.println("X = " + X);

        leitor.close();
    }
}
