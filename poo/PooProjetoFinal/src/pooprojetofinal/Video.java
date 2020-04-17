
package pooprojetofinal;

public class Video implements Acoes {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproducao;

    @Override
    public void play() {
        this.setReproducao(true);
    }

    @Override
    public void pause() {
        this.setReproducao(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproducao=" + reproducao + '}';
    }
    
    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproducao(false);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int) ((this.getAvaliacao() + avaliacao) / this.getViews());
        this.setAvaliacao(nova);
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproducao() {
        return reproducao;
    }
    public void setReproducao(boolean reproducao) {
        this.reproducao = reproducao;
    }
}