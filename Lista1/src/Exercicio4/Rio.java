package Exercicio4;

public class Rio {
    public String nome;
    public float nivel;
    public boolean poluido;

    public Rio(){
        this.nome = "Sem nome";
    }

    public Rio(String nome, float nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover (float x){
        this.nivel += x;
    }

    public void ensolarar(float x){
        if(this.nivel >= x) {
            this.nivel -= x;
        }
        else{
            System.out.println("Nível do rio não alterado.");
        }
    }

    public void limpar(){
        this.poluido = false;
    }

    public void sujar(){
        this.poluido = true;
    }

    public void mostra(){
        System.out.println ("Nome do Rio: " + nome + " Nível do rio: " + nivel + " O rio está poluido? " + (poluido? "Sim": "Não"));
    }
}

