
package poorelacionamento;

public class PooRelacionamento {

    public static void main(String[] args) {
        // TODO code application logic here
       Lutadores l[] = new Lutadores[6];
       l[0] = new Lutadores("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
       l[1] = new Lutadores("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
       l[2] = new Lutadores("Snapshadow", "EUA", 35, 1.65f, 80.6f, 12, 2, 1);
       l[3] = new Lutadores("Dead Code",  "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
       l[4] = new Lutadores("UFOCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
       l[5] = new Lutadores("Nerdaart", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);        
      
       Lutas UEC01 = new Lutas();
       UEC01.marcarLuta(l[2], l[3]);
       UEC01.lutar();
    }
}
