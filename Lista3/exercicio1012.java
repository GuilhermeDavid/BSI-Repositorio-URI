/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
*/

package Lista3_URI;

import java.util.Scanner;

public class exercicio1012 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
         
        double a, b, c, areatri, areacirculo, pi = 3.14159, areatrapezio, areaquadrado, arearetangulo;

        System.out.print("A = ");
         a = leitor.nextDouble();

         System.out.print("B = ");
         b = leitor.nextDouble();

         System.out.print("C = ");
         c = leitor.nextDouble();

        areatri = (a * c) / 2;
        
        areacirculo = pi * (c * c);
        
        areatrapezio = ((a + b) * c ) / 2;

        areaquadrado = b * b;

        arearetangulo = a * b;

        System.out.println("Triângulo = " + String.format("%.2f", areatri));

        System.out.println("Círculo = " + String.format("%.2f", areacirculo));

        System.out.println("Trapézio = " + String.format("%.2f", areatrapezio));

        System.out.println("Quadrado = " + String.format("%.2f", areaquadrado));

        System.out.println("Retângulo = " + String.format("%.2f", arearetangulo));

        leitor.close();
    }
}
