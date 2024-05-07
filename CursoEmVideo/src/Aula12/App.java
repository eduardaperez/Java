package Aula12;
/* Polimorfismo de Sobreposição:
 * Várias formas de se fazer algo ||
 * Permite que o mesmo nome represente vários comportamentos diferentes
 * 
 * Assinatura do método:
 * Iguais = mesma quantidade e tipos de PARÂMETROS
 * Diferentes = parâmetros em quantidade e/ou tipos diferentes
 * 
 * Tipos:
 * Sobreposição = sobrescrever com @override
 *  -> acontece quando substituimos um método de uma superclasse na sua subclasse, usando a mesma assinatura
 * Sobrecarga =  
 */

import Aula12.Mamifero.Cachorro;
import Aula12.Mamifero.Canguru;
import Aula12.Mamifero.Mamifero;

public class App {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Cachorro Toby = new Cachorro();
        Canguru Jack = new Canguru();

        m.locomover();
        Toby.locomover();
        Jack.locomover();

        Toby.emitirSom();
        Jack.emitirSom();
    }
}
