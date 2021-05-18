/* Dois carros (X e Y) partem em uma mesma direção. 
O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, 
ou seja, consegue se afastar um quilômetro a cada 2 minutos.
Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
*/
package Lista3_URI;

import java.util.Scanner;

public class exercicio1016 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int km, min;

        System.out.print("Distancia em km: ");
        km = leitor.nextInt();

        min = km * 2;

        System.out.println(min + " minutos");

        leitor.close();
    }
}
