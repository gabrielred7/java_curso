
package vetor;

import java.util.Arrays;

public class Vetor {

    public static void main(String[] args) {
        int n[] = {3, 2, 8, 7, 5, 4};
        System.out.println("Total de casas de N é: " + n.length);
        for(int c=0; c<= n.length - 1; c++){
            System.out.println("Na posição " + c + " temos o valor: " + n[c]);
        }
        
        System.out.println(" ");
        String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", 
            "Ago", "Set", "Out", "Nov", "Dez"};
        int total[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i] + " tem " + total[i] + " dias.");
        }
        
        int num[] = {3, 5, 1, 8, 4};
        for (int valor: num){
            System.out.println(valor);
        }
        
        double vet[] = {3.5, 2.75, 9, 4.5};
        Arrays.sort(vet); 
        for(double valor: vet){
            System.out.print(valor + " ");
        }
        System.out.println(" ");
        double vet2[] = {3, 7, 6, 1, 9, 4, 2};
        int p = Arrays.binarySearch(vet2, 2);
        System.out.println("Encontrei o valor na posição: " + p);
        
        int y[] = new int[20];
        Arrays.fill(y, 0);
        for(int valor: y){
            System.out.print(valor + " ");
        }  
        System.out.println(" ");
    }
}