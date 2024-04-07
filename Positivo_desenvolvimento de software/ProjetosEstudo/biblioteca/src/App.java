public class App {
    public static void main(String[] args) throws Exception {
        Autor autorLivro1 = new Autor("Sun Tzu");    
        Livro livro1 = new Livro("A Arte da Guerra",autorLivro1,500);
        
     
        livro1.exibirInformacoes();
    }
}