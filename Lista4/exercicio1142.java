// Escreva um programa que leia um valor inteiro N. Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

package Lista4_URI;

import java.util.Scanner;

public class exercicio1142 {
    
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);

        int n, n1 = 1, n2 = 2, n3 = 3, i;

        System.out.print("Valor: ");
        n = leitor.nextInt();

        for (i = 0; i < n; i++) {

        System.out.println(n1 + " " + n2 + " " + n3 + " PUM");
        n1 += 4;
        n2 += 4;
        n3 += 4;

        leitor.close();
        }
    }
}
