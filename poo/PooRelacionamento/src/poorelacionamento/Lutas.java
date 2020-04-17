
package poorelacionamento;

import java.util.Random;

public class Lutas {
    //Atributos
    private int roud;
    private boolean aprovada;
    private Lutadores desafiado; // Tipo abstrato de dados
    private Lutadores desafiante;
    
    //Metodos Especificos
    public void marcarLuta(Lutadores lado1, Lutadores lado2){
        if (lado1.getCategoria().equals(lado2.getCategoria()) && lado1 != lado2) {
            this.setAprovada(true);
            this.setDesafiado(lado1);
            this.setDesafiante(lado2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    
    public void lutar(){
        if (this.getAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();
            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();
            System.out.println("### Resultado #####");
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch(vencedor){
                case 0: 
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println(this.getDesafiado().getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().ganharLuta();
                    break;
                case 2:
                    System.out.println(this.getDesafiante().getNome());
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().perderLuta();
                    break;
            }
        } else {
            System.out.println("Luta nao pode acontecer");
        }
    }
    
    //Metodos Especiais
    public int getRoud() {
        return roud;
    }

    public void setRoud(int roud) {
        this.roud = roud;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }
}