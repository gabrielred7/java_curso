
package poopolimorfismo;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rasteja");
    }
    
    @Override
    public void alimentar() {
        System.out.println("Vegetais, insetos, ovos e peixes");
    }
    
    @Override
    public void existirSom() {
        System.out.println("Som de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
