/* Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, 
ao utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa. 
Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). 
Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. 
Mostre o valor com 3 casas decimais após o ponto.
*/

package Lista3_URI;

import java.util.Scanner;

public class exercicio1017 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double hr, km, total, carro = 12;

        System.out.print("Horas gasta na viagem: ");
        hr = leitor.nextDouble();

        System.out.print("Velocidade média em km: ");
        km = leitor.nextDouble();

        total = (hr * km) / carro;

        System.out.println("Serão necessarios " + String.format("%.3f", total) + " litros");

        leitor.close();
    }
}
                                                   