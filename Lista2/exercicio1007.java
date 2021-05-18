// Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

package lista2_URI;

import java.util.Scanner;

public class exercicio1007 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 
        
        int a, b, c, d, dif;

        System.out.print("Primeiro número: ");
         a = leitor.nextInt();

        System.out.print("Segundo número: ");
         b = leitor.nextInt();

        System.out.print("Terceiro número: ");
         c = leitor.nextInt();

        System.out.print("Quarto número: ");
         d = leitor.nextInt();
         
        dif = a * b - c * d;

        System.out.println(dif);

        leitor.close();

    }
}


