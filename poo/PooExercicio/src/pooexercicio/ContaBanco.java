
package pooexercicio;

public class ContaBanco {
    // Atributo
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Construtor
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    // Metodo Personalizado
    public void estadoAtual(){
        System.out.println("-----------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }      
    
    // Metodos Especificos
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com Dinheiro");
        } else if (this.getSaldo() < 0){
            System.out.println("Conta em Débito");
        } else {
            setStatus(false);
        }
    }
    public void depositar(float v){
        if (this.getStatus() == true){
           this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada");
        }
    }
    public void sacar(float v){
        if(this.getStatus() == true){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Impossivel sacar");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(tipo)){
            v = 12;
        } else if ("CP".equals(tipo)){
            v = 20;
        }
        
        if (this.getStatus() == true){
            if (this.getSaldo() > v){
                setSaldo(getSaldo() - v);
            } else {
                System.out.println("");
            }    
            } else {
            System.out.println("Impossivel pagar");
        }
    }

    // Metodos Especiais
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }  
    
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}