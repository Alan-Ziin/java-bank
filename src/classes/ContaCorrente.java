package classes;

public class ContaCorrente extends Conta { // Extends para dizer que a herança está vindo da Conta
    private double chequeLimite;
    // Super já está pegando os atributos do construtor do pai "Conta"
    public ContaCorrente(int numeroConta, String titularConta, String cpf, double chequeLimite){
        super(numeroConta, titularConta, cpf);
        this.chequeLimite = chequeLimite;
    }

    @Override // Utilizando herança, reescrevendo o código, por conta da nova função de cheque limite
    public void sacar(double valor){
        if (valor < 0){
            System.out.println("Digite um número valido");
        } else if (valor > saldo + chequeLimite) {
            System.out.println("Você está tentando sacar um valor a," +
                    " seu saldo limite para sacar é: "+(saldo+chequeLimite));
        } else {
            this.saldo -= valor;
        }
    }
}
