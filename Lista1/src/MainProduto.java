import Exercicio3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto();
        obj1.id = 01;
        obj1.qtde = 10;
        obj1.descricao = "Água";
        obj1.preco = 120;
        obj1.comprar(540);
        obj1.vender(30);
        obj1.subir(50);
        obj1.descer(10);
        obj1.mostrar();
    }
}
