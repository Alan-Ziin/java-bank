import classes.Conta;
import classes.ContaCorrente;

public class Main { //Classe para verificações de funções
    public static void main(String[] args) {
        Conta conta = new Conta(1234, "Alan", "roberto");
        conta.showDados();

        conta.depositar(500);
        conta.showDados();
        conta.sacar(600);

        conta.sacar(500);
        conta.showDados();
        ContaCorrente contaCorrente = new ContaCorrente(4321, "Alan 2", "roberto2", 200);

        contaCorrente.sacar(200);
        contaCorrente.showDados();
    }
}