// Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno.

package lista2_URI;

import java.util.Scanner;

public class exercicio1005 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 

        double a, b, media;

        System.out.print("Primeira nota:");
         a = leitor.nextDouble();

         System.out.print("Segunda nota:");
         b = leitor.nextDouble();

         media = (a + b) / 2;

         System.out.println("Média = " + media );

         leitor.close();
         
    }
}
