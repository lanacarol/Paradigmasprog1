import Exercicio2.Cliente;

public class TestaCliente{
    public static void main(String [] args) {
        Cliente pessoa1 = new Cliente ();
        pessoa1.nome = "Fulano";
        pessoa1.numeroConta = 229;
        pessoa1.numeroAgencia = 01;
        pessoa1.saldo = 50000;
        pessoa1.realizarDeposito(10);
        pessoa1.realizarSaque(60);
        pessoa1.exibirDados();

        Cliente pessoa2 = new Cliente ();
        pessoa2.nome = "Beltrano";
        pessoa2.numeroConta = 225;
        pessoa2.numeroAgencia = 02;
        pessoa2.saldo = 599;
        pessoa2.realizarDeposito(50);
        pessoa1.realizarSaque(10);
        pessoa2.exibirDados();
    }
}
