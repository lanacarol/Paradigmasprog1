package Lista1;

public class aluno {
    public int idade, numeroAluno;
    public float P1, P2, media;
    public String nome;

    public aluno() {
        this.nome = "Nome inválido";
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


    public void dadosAluno(){
        System.out.println(
                "Número do aluno: " + this.numeroAluno +
                " Nome do aluno: " + this.nome +
                " Idade do aluno: " + this.idade +
                " Média do aluno: " + this.media
        );
    }

}


