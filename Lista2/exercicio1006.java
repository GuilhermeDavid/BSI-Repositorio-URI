// Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. A seguir, calcule a média do aluno.

package lista2_URI;

import java.util.Scanner;

public class exercicio1006 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 
      
        double a, b, c, media;

        System.out.print("Primeira nota: ");
         a = leitor.nextDouble();

        System.out.print("Segunda nota: ");
         b = leitor.nextDouble();
         
        System.out.print("Terceira nota: ");
         c = leitor.nextDouble();

        media = (a + b + c) / 3;

        System.out.println("Media = " + media);

        leitor.close();
    }
}
