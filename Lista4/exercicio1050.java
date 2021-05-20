/* Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:
        DDD                         Destino
        61                          Brasilia
        71                          Salvador
        11                          Sao paulo
        21                          Rio de janeiro
        32                          Juiz de fora
        19                          Campinas
        27                          Vitoria
        31                          Belo Horizonte
*/
package Lista4_URI;

import java.util.Scanner;

public class exercicio1050 {
    
    public static void main(String[]args) {

        Scanner leitor = new Scanner(System.in);

        int n;

        System.out.print("DDD: ");
        n = leitor.nextInt();

            if (n == 61)
            System.out.println("Brasilia");
            
            else if (n == 71)
            System.out.println("Salvador");

            else if (n == 11)
            System.out.println("Sao Paulo");

            else if (n == 22)
            System.out.println("Rio de Janeiro");

            else if (n == 32)
            System.out.println("Juiz de fora");

            else if (n == 19)
            System.out.println("Campinas");

            else if (n == 27)
            System.out.println("Vitoria");

            else if (n == 31)
            System.out.println("Belo Horizonte");

            else 
            System.out.println("DDD invalido");

            leitor.close();
    }
}
