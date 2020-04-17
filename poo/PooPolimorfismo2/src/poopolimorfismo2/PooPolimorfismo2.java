
package poopolimorfismo2;

public class PooPolimorfismo2 {
    
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("ola");
        System.out.println("=====");
        c.reagir(20, 30);
        System.out.println("=====");
        c.reagir(true);
        c.reagir(false);
        System.out.println("=====");
        c.emitirSom();
        // TODO code application logic here
    }
    
}
