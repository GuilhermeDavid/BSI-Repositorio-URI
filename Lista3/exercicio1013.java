// Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “é o maior”.

package Lista3_URI;

import java.util.Scanner;

public class exercicio1013 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int a, b, c;

        System.out.print("A = ");
         a = leitor.nextInt();

         System.out.print("B = ");
         b = leitor.nextInt();

         System.out.print("C = ");
         c = leitor.nextInt();

            if (a > b && a > c)
                System.out.println(a + " é o maior");

            else if (b > a && b > c) 
                System.out.println(b + " é o maior");
                
            else 
                System.out.println(c + " é o maior");
                
                leitor.close();
    }
    
}
