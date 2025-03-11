package Exercicio2;

public class Cliente{
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(){
        this.nome = "Nome inválido";
        this.numeroConta = 0;
        this.numeroAgencia = 0;
    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo){
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float x){
        this.saldo = this.saldo + x;
    }

    public void realizarSaque(float y){
        if(this.saldo >= y) {
                this.saldo = this.saldo - y;
                System.out.println("Saque realizado com sucesso!");
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirDados(){
        System.out.println(
                "Número da conta: " + this.numeroConta +
                        " Nome do cliente: " + this.nome +
                        " Saldo atual: " + this.saldo);
    }
}

