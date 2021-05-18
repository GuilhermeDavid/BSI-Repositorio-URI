/* A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.
*/

package lista2_URI;

import java.util.Scanner;

public class exercicio1002 {
    
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        
        double raio, pi= 3.14159, area;

        System.out.print("Informe o raio: ");
         raio = leitor.nextDouble();

        area = pi * (raio * raio);

        System.out.println("A area dessa circunferência é = " +String.format("%.4f", area));

        leitor.close();
    }
}
