package Exercicio4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){
        this.nome = "Sem nome";
    }

    public Rio(String nome, float nível, boolean poluido){
        this.nome = nome;
        this.nivel = nível;
        this.poluido = poluido;
    }

    public void chover (float x){
        this.nivel += x;
    }

    public void ensolarar(float x){
        this.nivel -= x;
    }

    public void limpar(){
        this.poluido = false;
    }

    public void sujar(){
        this.poluido = true;
    }

    public void mostra(){
        System.out.println ("Nome do Rio: " + nome + " Nível do rio: " + nivel + " O rio está poluido? " + poluido);
    }
}

