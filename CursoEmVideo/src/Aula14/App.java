package Aula14;

public class App {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Eduarda", "F", 32, "eduardaperez");
        g[1] = new Gafanhoto("Julio", "M", 30, "julioerk");
        
        System.out.println(v[0]);
        System.out.println(g[0]);
    } 
}
