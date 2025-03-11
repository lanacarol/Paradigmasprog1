import Exercicio4.Rio;

public class MainRio {
    public static void main(String[] args){
        Rio obj1 = new Rio();
        obj1.nome = "Rio Negro";
        obj1.nivel = 95;
        obj1.poluido = true;
        obj1.chover(10);
        obj1.ensolarar(5);
        obj1.limpar();
        obj1.mostra();

        Rio obj2 = new Rio ();
        obj2.nome = "Rio Amazonas";
        obj2.nivel = 123.5f;
        obj2.poluido = true;
        obj2.chover(7);
        obj2.ensolarar(2);
        obj2.limpar();
        obj2.sujar();
        obj2.mostra();

    }
}

