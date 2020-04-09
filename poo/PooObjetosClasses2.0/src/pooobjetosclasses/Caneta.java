
package pooobjetosclasses;

public class Caneta {
    // Atributos
    public String modelo;
    public String cor;
    protected float ponta;
    protected int carga;
    private boolean tampa;
    
    //Metodos
    public void tampar(){
        this.tampa = true;
    }
    
     public void destampar(){
        this.tampa = false;
    }
     
     public void rabiscar(){
        if (this.tampa == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando");
        }       
    }
    /**
    Obs: this é o nome do objeto que fez a chamada. Sempre que se quiser modificar um atributo dentro da classe poem-se um this na frente da linha 
    que irá mexer no atributor. 
    **/
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampa);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }
}