
package pooexercicio;

public class PooExercicio {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        p2.depositar(100);
        p2.sacar(500);
        p2.estadoAtual();
        
        ContaBanco p3 = new ContaBanco();
        p3.setNumConta(3333);
        p3.setDono("Rafael");
        p3.abrirConta("CP");
  
        p3.estadoAtual();
        // TODO code application logic here
    }
    
}
