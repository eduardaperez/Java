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

public interface Controlador {
    //aqui não terá implementação, pois é previsto e não implementado
    //métodos são públicos
    public abstract void ligar();
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
