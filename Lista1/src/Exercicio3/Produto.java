package Exercicio3;

public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    public Produto() {this.descricao = "Sem descricao";
        this.preco = 0;}

    public Produto(int id, int qtde, String descricao, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void comprar(int x){
        this.qtde += x;
    }

    public void vender (int x){
        this.qtde -= x;
    }

    public void subir (float x){
        this.preco += x;
    }

    public void descer (float x){
        this.preco -= x;
    }

    public void mostrar(){
        System.out.println(
                "Id: " + this.id +
                " Quandidade: " + this.qtde +
                " Descricao: " + this.descricao +
                " Preco: " + this.preco);
    }
}
