/* Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.
*/
package Lista4_URI;

import java.util.Scanner;

public class exercicio1060 {
    
    public static void main(String[]args) {

        Scanner leitor = new Scanner(System.in);
        
        double n;

        int total = 0;

        for  (int i = 0; i < 6; i++){
            
            System.out.print("Numero: ");
            n = leitor.nextDouble();
                
            if (n > 0)
                total += 1 ;
            
        }
        System.out.println(total + " valor(es) positivos");
        
        leitor.close();
    }
}
