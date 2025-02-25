//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //criando objetos da classe
        //instaciar a classe
        Carro obj1 = new Carro ();
        obj1.ano = 2022;
        obj1.velocidade = 0;
        obj1.marca = "Volkswagen";
        obj1.modelo = "Polo";
        obj1.acelerar(100);
        obj1.freiar(20);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro (2024, 50, "Fiat", "FastBack");
        obj2.acelerar(30);
        obj2.exibirDetalhes();
        obj2.freiar(90);

        Carro obj3 = new Carro (); //chama o construtor
        obj3.exibirDetalhes();
    }
}