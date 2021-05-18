// Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

package Lista3_URI;

import java.util.Scanner;

public class exercicio1019 {
    
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        int seg, min, hrs;

        System.out.print("Tempo de duração (em segundos) do evento: ");
        seg = leitor.nextInt();

        hrs = seg / 3600;

        min = seg / 60;
         
            if (min >= 1)
                seg = seg - 60 * min;
            
            if (hrs >= 1)
                min = min - 60 * hrs;

        System.out.println(hrs + ":" + min + ":" + seg);

        leitor.close();
    }
}
