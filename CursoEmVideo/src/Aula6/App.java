package Aula6;
//Encapsulamento: proteger, ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior
//!!! Um bom objeto encapsulado possui uma boa interface
//Interface: lista de serviços fornecidos por um componente. É o contato com o mundo exterior, que define o que pode ser feito com um objeto dessa classe.
//!!! Encapsular não é obrigatório, mas é uma boa prática para produzir Classes mais eficientes.
/*Vantagens:
 * Tornar mudanças invisíveis
 * Facilitar reutilização de código
 * Reduzir efeitos colaterais
 */

public class App {
    public static void main(String[] args) {
        Controle c1 = new Controle();
        c1.ligar();
        c1.maisVolume();
        c1.play();
        c1.abrirMenu();
        c1.fecharMenu();
    }
}
