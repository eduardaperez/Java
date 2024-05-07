package Aula13;

import Aula12.Mamifero.Mamifero;
import Aula13.Mamifero.Cachorro;
import Aula13.Mamifero.Lobo;

/*Polimorfismo de sobrecarga
 * Usar assinaturas diferentes dentro da mesma classe
 */
public class App {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Lobo lobo = new Lobo();
        Cachorro max = new Cachorro();

        //Sobreposição:
        m.emitirSom();
        lobo.emitirSom();
        max.emitirSom();

        //Sobrecarga:
        max.reagir("Oi");
        max.reagir("feio");
        max.reagir(11, 45);
        max.reagir(21, 00);
        max.reagir(true);
        max.reagir(false);
        max.reagir(2, 12.5f);
        max.reagir(15, 4.5f);

    }
}
