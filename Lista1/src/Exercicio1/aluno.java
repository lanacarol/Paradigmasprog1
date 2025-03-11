package Exercicio1;

public class aluno {
    public int idade, numeroAluno;
    public float P1, P2, media;
    public String nome;

    public aluno() {
        this.nome = "Sem nome";
    }

    public aluno(int numeroAluno, String nome, int idade, float P1, float P2, float media) {
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.P1 = P1;
        this.P2 = P2;
        this.media = media;
    }

    public void notaFinal() {
        this.media = ((this.P1 + this.P2) / 2);
        System.out.println("Media " + this.media);
    }

//    public void passou(){
//        if(this.media >= 6){
//            System.out.println("Passou.");
//        }
//        else{
//            System.out.println("Não passou.");
//        }
//    }

    public String passou1(){
        return (this.media >= 6) ? "Passou " : "Não passou";
    }


    public void dadosAluno(){
        System.out.println(
                "Número do aluno: " + this.numeroAluno +
                " Nome do aluno: " + this.nome +
                " Idade do aluno: " + this.idade +
                " Situação: " + this.passou1()
        );
    }
    //this é o objeto que chama o metodo
}


