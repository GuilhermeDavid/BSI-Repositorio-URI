// Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

package Lista3_URI;

import java.util.Scanner;

public class exercicio1014 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        double km, l, consumo;

        System.out.print("Distância total percorrida em km: ");
        km = leitor.nextDouble();

        System.out.print("Combustível gasto em litros: ");
        l = leitor.nextDouble();

        consumo = km / l;

        System.out.println("Consumo médio = " + String.format("%.3f", consumo));

        leitor.close();
    }
}
