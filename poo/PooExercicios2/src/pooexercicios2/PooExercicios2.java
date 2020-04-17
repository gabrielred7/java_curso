
package pooexercicios2;

public class PooExercicios2 {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Vitor", 22, "M");
        p[1] = new Pessoa("Julia", 21, "F");
        
        l[0] = new Livro("As Aventuras de Tom Sawyer", "Mark Twain", 144, p[0]);
        l[1] = new Livro("O Apanhador no Campo de Centeio", "J. D. Salinger", 240, p[1]);
        l[2] = new Livro("Demian", "Hermann Hesse", 176, p[0]);
        
        System.out.println(l[0].getAutor());
        
        // toString retona uma string
        
        System.out.println(l[0].detalhes());
    }    
}
