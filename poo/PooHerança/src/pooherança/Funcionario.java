package pooherança;

public class Funcionario extends Pessoa  {
    // Atributos
    private String setor;
    private boolean trabalhando;
    
    //Metodos
    public void mudarTrabalho(){
        if (this.getTrabalhando()) {
            this.setTrabalhando(false);
        } else {
            this.setTrabalhando(true);
        }
    }
    
    //Metodo Especiais
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
