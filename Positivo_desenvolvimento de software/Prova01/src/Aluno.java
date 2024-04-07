/*
• Construtor – o construtor não deve receber ou calcular a média e as notas devem
ser maior que 0 para serem aceitas se não elas devem ser iniciadas com 0;
• Getters e Setters;
• Ao receber as notas deve ser verificado se a nota recebida é maior do que a nota
existente, a maior nota precisa ser mantida e a média deve ser atualizada;
• Ao utilizar set de média o método deve verificar se a média informada é igual a
média das notas cadastradas e deve emitir um aviso caso não seja, solicitando utilizar o
método calcularMedia().

• status() – O método deve atualizar a média, mostrar o nome da disciplina, do
professor se o aluno foi aprovado (nota >= 7) se ele está de final (nota >=2 ) ou se ele está
reprovado direto (nota < 2);
main - Crie pelo menos 1 Aluno com notas baixas e exiba seu status, em seguida
tente baixar uma das notas e exiba o status novamente, por último aumente a nota o
suficiente para o aluno ser aprovado e exiba seu status.*/


//Crie uma classe chamada Aluno
public class Aluno {
    //atributos: nome, idade, nota1, nota2, média das notas
    private String nome;
    private int idade;
    private double nota1, nota2, media;
    private Disciplina disciplina;

    public Aluno (String nome, int idade, Disciplina disciplina){
        this.nome = nome;
        this.idade = idade;
        calcularMedia();
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
    }

    //as notas devem ser maior que 0 para serem aceitas se não elas devem ser iniciadas com 0
    //• calcularMedia() – O método deve calcular a média do aluno ((nota1 +nota2) / 2);
    public void calcularMedia(double nota1, double nota2) {
        if (nota1 < 0 || nota2 < 0) {
            System.out.println("Nota inválida");
            media = 0;
        } 
        media = (nota1 + nota2) / 2; 
    }

}
