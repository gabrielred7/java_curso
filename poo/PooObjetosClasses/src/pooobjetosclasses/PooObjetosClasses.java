
package pooobjetosclasses;

public class PooObjetosClasses {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.modelo = "Bic Crystal";
        c1.destampar();
        c1.status();
        c1.rabiscar();
        
        System.out.println("\r\n");
        
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 0.9f;
        c2.modelo = "Compactor";
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
