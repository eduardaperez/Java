package util;

public abstract class Util {
    private static int idLivro = 1;
    // private static int idRelatorio = 1;
    private static int idEmprestimo = 1;

    public static int gerarIdLivro(){
        return idLivro++;
    }
    
    /*public static int gerarIdRelatorio(){
        return idRelatorio++;
    } */
    
    public static int gerarIdEmprestimo(){
        return idEmprestimo++;
    }

    public static int gerarIdUsuario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'gerarIdUsuario'");
    }
}
