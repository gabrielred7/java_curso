
package pooobjetosclasses;

public class Caneta {
    // Atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampa;
    //Metodos
    void rabiscar(){
        if (this.tampa == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando");
        }       
    }
    
    void tampar(){
        this.tampa = true;
    }
    
     void destampar(){
        this.tampa = false;
    }
    /**
    Obs: this é o nome do objeto que fez a chamada.
    Sempre que se quiser modificar um atributo 
    dentro da classe poem-se um this na frente da linha 
    que irá mexer no atributor. 
    **/
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Está tampada? " + this.tampa);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
    }
}