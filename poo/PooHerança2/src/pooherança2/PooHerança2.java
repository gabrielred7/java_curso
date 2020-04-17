
package pooherança2;

public class PooHerança2 {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());
   
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMatricula(1111111);
        a1.setCurso("Informatica");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1111122);
        b1.setNome("Marta");
        b1.setSexo("F");
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
    }   
}
