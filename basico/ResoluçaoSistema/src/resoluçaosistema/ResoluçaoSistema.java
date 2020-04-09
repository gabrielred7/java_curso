/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resoluçaosistema;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ResoluçaoSistema {
    public static void main(String[] args) {
         Toolkit tk = Toolkit.getDefaultToolkit();
         Dimension resoluçao = tk.getScreenSize();
         System.out.println("Sua tela tem resolução de " + resoluçao.width + " x " +resoluçao.height);
    }
}
