
package metodos;

public class Metodos {

   // Procedimento
   static void soma(int a, int b){
        int s = a + b;
        System.out.println("A soma é: " + s);
    }
   //Função
   static int soma2(int a, int b){
       int s = a + b;
       return s;
   }
    public static void main(String[] args) {
        // OBS: O proprio main é um metodo que não retorna valor, ou seja um procedimento
         System.out.println("Começou o programa: ");
        soma(5, 2);
        
        int sm = soma2(5, 2);
        System.out.println("A soma vale: " + sm);
    }
}