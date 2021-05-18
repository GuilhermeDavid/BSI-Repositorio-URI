// Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.



package lista2_URI;

import java.util.Scanner;

public class exercicio1003 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 
        
        int A, B, SOMA;

        System.out.print("Informe o primeiro número: ");
         A = leitor.nextInt();

        System.out.print("Informe o segundo número: ");
         B = leitor.nextInt();

         SOMA = A + B;

        System.out.println(SOMA);

         leitor.close();
         
    }   
}
