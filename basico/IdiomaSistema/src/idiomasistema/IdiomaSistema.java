/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomasistema;
import java.util.Locale;
public class IdiomaSistema {
    public static void main(String[] args) {
        Locale linguagem = Locale.getDefault();
        System.out.println ("Seu computador está em: " + linguagem.getDisplayLanguage()); 
    } 
}
