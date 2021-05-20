/* Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, 
caso haja uma divisão por 0 ou raiz de numero negativo.
*/
package Lista4_URI;

import java.util.Scanner;

public class exercicio1036 {
    
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);
        
        double a , b , c, delta, x1, x2, raizdelta;

        System.out.print("A =");
        a = leitor.nextDouble();

        System.out.print("B =");
        b = leitor.nextDouble();

        System.out.print("C =");
        c = leitor.nextDouble();

        delta = (b * b) - 4 * a * c;

        raizdelta = Math.sqrt(delta);

        x1 = (-b + raizdelta) / (2 * a);

        x2 = (-b - raizdelta) / (2 * a);        

        if (a == 0 || delta < 0 )
            System.out.println("Impossivel de calcular");

        else {
            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);    
        }    
            leitor.close();

    }
}
