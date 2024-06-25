package Aula15;

public class App {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Eduarda", "F", 32, "eduardaperez");
        g[1] = new Gafanhoto("Julio", "M", 30, "julioerk");
        
        //System.out.println(v[0]);
        //System.out.println(g[0]);

        Visualizacao vis[] = new Visualizacao[3];

        vis[0] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[2]);
        vis[1].avaliar(35.0f);
        System.out.println(vis[1].toString());

        vis[2] = new Visualizacao(g[1], v[2]);
        vis[2].avaliar(10);
        System.out.println(vis[1].toString());
    } 
}
