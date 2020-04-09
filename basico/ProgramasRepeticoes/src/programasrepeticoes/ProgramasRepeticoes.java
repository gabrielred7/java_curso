/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programasrepeticoes;

/**
 *
 * @author Gabriel - Trabalho
 */
public class ProgramasRepeticoes {
    
    public static void main(String[] args) {
         //Repetição While
        int cc = 1;
        while (cc <= 4) {
            System.out.println("Cambalota: " + cc);
            cc = cc + 1;
        }
        // Mundando Fluxo de Variavel
        int va = 0;
        while (va < 10){
            va++;
            if(va == 5 || va == 6){
                continue;
            }
            if (va == 9) {
                break;
            }
            System.out.println("Cambalhota: " + va);
        }
        
        //Repetição Do-While
        int bb = 0;
        do{
            System.out.println(bb);
            bb++;
        }
        while(bb <= 4);
        
        // Repetição For
          for (int aa = 0; aa <= 100; aa=aa+10){
            System.out.println("Cambalhota: " + aa);
        }
    }
}