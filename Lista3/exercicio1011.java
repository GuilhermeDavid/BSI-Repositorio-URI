/* Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
 A fórmula para calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
*/

package Lista3_URI;

import java.util.Scanner;

public class exercicio1011 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in); 
        
        double raio, pi = 3.14159, volume;

        System.out.print("Raio: ");
         raio = leitor.nextDouble();

        volume = (4 / 3) * pi * (raio * raio * raio);
        
        System.out.println("Volume = " + String.format("%.2f", volume));

        leitor.close();
    } 
}
