package poopolimorfismo;

public class Peixe extends Animal{
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    };
    
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias ou outros peixes");
    }

    @Override
    public void existirSom() {
        System.out.println("Peixe não faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}