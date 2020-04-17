
package poopolimorfismo;

public class PooPolimorfismo {

    public static void main(String[] args) {
        Mamifero m1 = new Mamifero();
        m1.setPeso(85.3f);
        m1.setIdade(2);
        m1.setMembros(4);
        m1.locomover();
        m1.alimentar();
        m1.existirSom();
        System.out.println("=================");
        Peixe p1 = new Peixe();
        p1.setPeso(0.35f);
        p1.setIdade(1);
        p1.setMembros(0);
        p1.locomover();
        p1.alimentar();
        p1.existirSom();
        p1.soltarBolha();
        System.out.println("==================");
        Ave a1 = new Ave();
        a1.setPeso(0.89f);
        a1.setIdade(2);
        a1.setMembros(2);
        a1.locomover();
        a1.alimentar();
        a1.existirSom();
        a1.fazerNinho();
        // TODO code application logic here
        System.out.println("====================");
    }
    
}
