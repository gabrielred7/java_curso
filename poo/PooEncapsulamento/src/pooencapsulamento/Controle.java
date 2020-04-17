
package pooencapsulamento;

public class Controle implements Controlador {
    // Atributos
    private int volume;
    private boolean ligando;
    private boolean tocando;

    // Metodos Especiais
    public Controle() {
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigando() {
        return ligando;
    }
    private void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    private boolean getTocando() {
        return tocando;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Metodos Abstratos
    @Override // Sobreescrever, ja tinha um metodo definido mas agora vai programar ele
    public void ligar() {
        this.setLigando(true);
    }

    @Override
    public void desligar() {
        this.setLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigando());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i = i + 10) {
            System.out.print("|");
        }
        System.out.println("\n");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu");
    }

    @Override
    public void maisVolume() {
        if (this.getLigando()){
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("Impossivel aumentar volume");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigando()){
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("Impossivel diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getVolume() > 0 && this.getLigando() == true){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getVolume() == 0 && this.getLigando() == true){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigando() == true && this.getTocando() == false){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigando() == true && this.getTocando() == true){
            this.setTocando(false);
        }
    }
}