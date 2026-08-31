package classes;

import java.beans.PropertyEditorSupport;

public class Conta {
    private int numeroConta;
    private String titularConta;
    private String cpf;
    protected double saldo;

    public Conta(int numeroConta, String titularConta, String cpf) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor < 0) {
            System.out.println("Coloque um valor válido");
        } else {
            this.saldo += valor;
        }
    }

    public void sacar(double valor){
        if (valor > saldo || valor < 0){
            System.out.println("Coloque um número valido.");
        }else{
            this.saldo -= valor;
        }
    }
    public void showDados(){
        System.out.println("Numero da conta: " +this.numeroConta+"\n"+
                "Titular da conta: "+this.titularConta+"\n"+
                "CPF do Titular: "+this.cpf+"\n"+
                "Saldo atual do menino: "+this.saldo);
    }
}

