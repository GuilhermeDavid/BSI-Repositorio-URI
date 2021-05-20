// Leia 1 valor inteiro N. A seguir, mostre a tabuada de N:

package Lista4_URI;

import java.util.Scanner;

public class exercicio1078 {
    public static void main(String[] args) {
		
        Scanner leitor = new Scanner(System.in);
        
        int n, i, mult = 1, valor = 0;

        System.out.print("Numero: ");
        n = leitor.nextInt();

        for (i = 1; i <= 10; i++){
            valor = n * mult;
            System.out.println(mult + " X " + n + " = " + valor);
            mult += 1;
 
            leitor.close();

        }            
    }
}
