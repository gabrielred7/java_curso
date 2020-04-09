
package poométodos;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampa;
    private String cor;
    
    public Caneta(String m, String c, float p) { // este é um metodo Construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
    }
    
    public void tampar(){
        this.tampa = true;
    }
    
    public void destampar(){
        this.tampa = false;
    }
     
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }
    
    public boolean getTampa() {
        return this.tampa;
    }

    public void setTampa(boolean t) {
        this.tampa = t;
    }
    
   public void status(){
       System.out.println("Sobre a caneta: ");
       System.out.println("Modelo: " + this.getModelo());
       System.out.println("Ponta: " + this.getPonta());
       System.out.println("Cor: " + this.getCor());
       System.out.println("Tampa: " + this.getTampa());
   }
}
