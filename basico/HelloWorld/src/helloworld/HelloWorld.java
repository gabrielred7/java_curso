
package helloworld;
import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Digite seu nome, por favor: ");
        Scanner entradas = new Scanner(System.in);
        String nome = entradas.nextLine();
        
        System.out.println("Oi, " + nome + "!");        
       
        System.out.println("Digite sua idade, por favor: ");
        int idade = entradas.nextInt();
        
        System.out.println("Obrigado pela idade " + idade);
    }
}
