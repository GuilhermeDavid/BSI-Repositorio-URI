/* Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula,
*/

package Lista3_URI;

import java.util.Scanner;

public class exercicio1015 {
    
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double x1, x2, y1, y2, distancia, difx, dify, somaxy;

        System.out.print("X1 = ");
        x1 = leitor.nextDouble();

        System.out.print("X2 = ");
        x2 = leitor.nextDouble();

        System.out.print("Y1 = ");
        y1 = leitor.nextDouble();

        System.out.print("Y2 = ");
        y2 = leitor.nextDouble();

        difx = (x2 - x1) * (x2 - x1);

        dify = (y2 - y1) * (y2 - y1);

        somaxy = difx + dify;

        distancia = Math.sqrt(somaxy);

        System.out.println("Distancia = " + String.format("%.4f", distancia));

        leitor.close();
    }
}
