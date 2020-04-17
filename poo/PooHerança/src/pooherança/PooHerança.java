
package pooherança;


public class PooHerança {

    public static void main(String[] args) {
        Pessoa p0 = new Pessoa();
        Aluno p1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario p3 = new Funcionario();
        
        p0.setNome("Pedro");
        p1.setNome("Maria");
        p2.setNome("Claúdia");
        p3.setNome("Fabiana");
        
        p1.setCurso("Informatica");
        p2.setSalario (2500.75f);
        p3.setSetor("Estoque");
        p1.setMatricula(117204959);
        
        System.out.println(p1.getNome());
        System.out.println(p1.getMatricula());
        p1.cancelarMatricula();
        System.out.println(p1.getMatricula());
        System.out.println(p1.toString());
        // TODO code application logic here
    }
    
}
