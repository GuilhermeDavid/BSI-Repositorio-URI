/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o total a receber no final do mês, com duas casas decimais.
*/

package lista2_URI;
import java.util.Scanner;
public class exercicio1009 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
            
        String nome;
        
        float vendas, comis, salariocomis, salario;
        
        System.out.print("Informe o nome do vendedor: ");
            nome = leitor.next();
            
        System.out.print("Informe o salário fixo do vendedor: ");
            salario = leitor.nextFloat();
            
        System.out.print("Informe quanto o vendedor vendeu esse mês: ");
            
            vendas = leitor.nextFloat();
            
            comis = vendas * 0.15f;
            
            salariocomis = salario + comis;
              
        System.out.println("Nome: " + nome);
            
        System.out.println("Salário: " + salario);
            
        System.out.println("vendas: " + vendas);
            
        System.out.println("Comissão: " + comis);
            
        System.out.println("Esse funcionario deve receber ao total, R$" + salariocomis);
               
            leitor.close();
    }   
}
