
package helloworld;


public class Aluno {
    private String nome;
    private long dre;
    private int creditosAcumulados;
    private float cra;

    
    void registrarConclusaoDisciplina(String codigoDisciplina, int quantCreditos, float mediaFinal){
        float numeradorCorrenteCra = this.getCra() * this.creditosAcumulados;
        this.creditosAcumulados += quantCreditos;
        float novaParcela = quantCreditos * mediaFinal;
        setCra((numeradorCorrenteCra + novaParcela) / this.creditosAcumulados);
    }
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getCra() {
        return cra;
    }

    public void setCra(float cra) {
        this.cra = cra;
    }
}