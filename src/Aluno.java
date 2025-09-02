public class Aluno {
    String nome ;
    int idade;
    double matricula;
    String turma;
    String sala ;

    void exibirInformacoes(){
        System.out.println("Este e o nome do aluno" +nome);
        System.out.println("Idade do aluno: "+idade);
        System.out.println("A matricula do aluno: "+matricula);
        System.out.println("O aluno esta matriculado na turma: "+turma);
        System.out.println("O aluno esta na sala: "+sala);
    }
}
