
package poométodos;

public class PooMétodos {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f);
        c1.status();
        
        Caneta c2 = new Caneta("K", "Laranja", 1.5f);
        c2.status();
        /**
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        * */
    }
    
}
