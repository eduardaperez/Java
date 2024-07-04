package edu.eduarda.javaBasico.caderno;

// shift + alt + f = identação
// organizar arquivos com pacotes - convenção mvc (model, view, controller)
public class AnatomiaClasses {

    public static void main(String[] args) { // é necessário o método especial de inicialização se a classe é executável

        System.out.println("----- Hello World ------");

        // Atributos:
        String primeiroNome = "Eduarda"; // Tipo nomeBemDefinido = atribuiçãoOpcional;
        String segundoNome = "Perez";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); // tipo variável = método(parâmetros)

        System.out.println("Hello " + nomeCompleto);
    }

    // Métodos:
    public static String nomeCompleto(String primeiroNome, String segundoNome) { // tipo nomeBemDefinido (parâmetros
                                                                                 // tipados) {escopo}
        return primeiroNome.concat(" ").concat(segundoNome); // pode usar + ou .concat()
    }

}