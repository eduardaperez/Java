package Aula11;
/* Herança
 * Árvore de herança:
 *          A    = mãe | progenitora
 *       ___|___
 *      AA      AB   = mãe | filha | progenitora
 *    ___|    ___|___
 *  AAA     ABA     ABB filha | descendenteA
 *        ___|___
 *     ABAA    ABAB   = filha | descendenteAeAB | folha
 * 
 * MÃE|PROGENITORA = quando possui classes filhas, que herdam 
 * FILHA = quando possui classe mãe. Tbm pode ser mãe se houver subclasse relacionada à ela
 * RAIZ = início da árvore, classe que não possui mães = A
 * FOLHAS = classes que não tem filhas, são o final da árvore
 * DESCENDENTE = quando a classe filha é filha de outra classe (neta) = AAA descendente de A
 * ANCESTRAL = quando a classe mãe é mãe de outra classe (vó) = A ancestral de AAA
 * 
 * ESPECIALIZAÇÃO = Percorrer a ávore de cima para baixo 
 * GENERELIZAÇÃO = Percorrer a árvore de baixo para cima
 * 
 * Tipos de Heerança:
 * HERANÇA DE IMPLEMENTAÇÃO (pobre) = contém apenas métodos e atributos herdados
 * HERANÇA PARA DIFERENÇA = contém outros métodos e atributos além dos herdados
 * 
 * SOBRESCRIÇÃO = sobrescrever métodos que não são static
 * 
 * CLASSE ABSTRATA = NÃO pode ser instanciada, serve apenas como progenitora
 * MÉTODO ABSTRATO = Método declarado mas não implementado na progenitora (colocado apenas em interface ou classe abstrata)
 * CLASSE FINAL = Não pode ser herdado por outra classe, ela é obrigatoriamente uma Folha.
 * MÉTODO FINAL = Não pode ser sobrescrito pelas suas sub-classes. Ele é obrigatoriamente herdado
 */
public class App {

    public static void main(String[] args) {
        /*Visitante v1 = new Visitante("Eduarda", 30, "F");

        System.out.println(v1.toString()); */

        /*Aluno a1 = new Aluno("Julio", "M", 30, 0256, "ADS");

        a1.pagarMensal();
        a1.fazerAniver();
        System.out.println(a1.toString());*/

        Bolsista b1 = new Bolsista("Felipe", "M", 20, 5461, "EE", 100f);

        b1.pagarMensal();
        System.out.println(b1.toString());
        
    }
    
}
