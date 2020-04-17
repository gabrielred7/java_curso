package pooprojetofinal;

public class PooProjetoFinal {

    public static void main(String[] args) {
        System.out.println("========== Video ==========");
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de Java POO");
        v[1] = new Video("Aula 5 de PHP");
        v[2] = new Video("Aula 12 de HTML5");
        System.out.println(v[0].toString());
        
        System.out.println("\n========== Gafanhoto ==========");
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
        System.out.println(g[1].toString());
        
        System.out.println("\n========== Visualizaçao ==========");
        Visualizacao vis = new Visualizacao(g[0], v[2]);
        System.out.println(vis.toString());
    }
}