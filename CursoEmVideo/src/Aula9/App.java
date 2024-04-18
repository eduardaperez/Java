package Aula9;

public class App {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[4];

        p[0] = new Pessoa("Eduarda", "Feminino", 30);
        p[1] = new Pessoa("Julio", "Maculino", 29);

        l[0] = new Livro("A Revolução dos Bichos", "George Olwell", 322, p[1]);
        l[1] = new Livro("O Resgate do Tigre", "Colleen Houck", 430, p[0]);
        l[2] = new Livro("A Revolução dos Bichos", "George Olwell", 322, p[0]);
        l[3] = new Livro("GOT", "G. Martin", 892, p[0]);

        p[0].fazerAniver();
        l[1].folhear(30);
        l[1].voltarPag();
        l[1].fechar();
        l[1].avancarPag();
        l[1].abrir();
        l[1].avancarPag();
        l[1].folhear(1);
        l[1].voltarPag();
        l[1].folhear(430);
        l[1].avancarPag();

        l[1].detalhes();

    }
}
