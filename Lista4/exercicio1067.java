// Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

package Lista4_URI;

import java.util.Scanner;

public class exercicio1067 {
    
    public static void main(String[]args) {
        
        Scanner leitor = new Scanner(System.in);

        int x, i;

        System.out.print("Número: ");
        x = leitor.nextInt();

        for (i = 1; i <= x; i += 2) {
            System.out.println(i);
            
            leitor.close();
        }            
    }
}
