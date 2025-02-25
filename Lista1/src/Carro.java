import javax.swing.*;

public class Carro {
    //variáveis
    //do tipo primitivo
    public int ano;
    public float velocidade;
    //do tipo classe
    public String marca, modelo;

    //métodos construtores
    public Carro (){
        this.marca = "Marca inválida";
        this.modelo = "Modelo inválido";
    }

    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //metódos
    public void exibirDetalhes(){
        JOptionPane.showMessageDialog(null,
                 "Marca: " + this.marca +
                "; Modelo: " + this.modelo +
                "; Ano: " + this.ano +
                "; Velocidade: " + this.velocidade);
    }

    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }

    public void freiar(float x){
        if(this.velocidade - x >= 0){
            this.velocidade -= x;
        }
        else{
            System.out.println("Não é possível freiar");
        }
    }
}
