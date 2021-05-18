// Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente. 

package lista2_URI;

import java.util.Scanner;

public class exercicio1004 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 

        int a, b, PROD;

        System.out.print("Primeiro número: ");
         a = leitor.nextInt();

         System.out.print("Segundo número: ");
         b = leitor.nextInt();

        PROD = a * b;

        System.out.println("Produto = " + PROD);

        leitor.close();
    

    } 
}
