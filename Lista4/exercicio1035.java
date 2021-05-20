/* Leia 4 valores inteiros A, B, C e D. A seguir, 
se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos,
 forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
*/

package Lista4_URI;

import java.util.Scanner;

public class exercicio1035 {
    
    public static void main(String[]args) {

        Scanner leitor = new Scanner(System.in);

        int a, b, c, d, ab, cd;

        System.out.print("A =");    
        a = leitor.nextInt();

        System.out.print("B =");    
        b = leitor.nextInt();

        System.out.print("C =");    
        c = leitor.nextInt();

        System.out.print("D =");    
        d = leitor.nextInt();

        ab = a + b;
        cd = c + d;

            if (b > c && d > a && cd > ab && a > 0 && b > 0 && c > 0 && d > 0 && a % 2 == 0)
                System.out.println("Valores aceitos");

            else
                System.out.println("Valores não aceitos");

                leitor.close();
    }
}
