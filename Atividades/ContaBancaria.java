package Atividades;
/*
8 - Classe Conta Bancária:
Desenvolva uma classe ContaBancaria com atributos como saldo, número da conta e métodos para
depositar e sacar
*/

import java.util.Scanner;

public class ContaBancaria {
    public double saldo;
    public String numeroDaConta;

    public ContaBancaria(double saldo, String numeroDaConta) {
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Você depositou R$: " + valor);
    }

    public void sacar(double valor){
        if ( saldo < valor){
            System.out.println("Você não possui saldo suficiente!");
        } else {
            saldo -= valor;
            System.out.println("Você sacou R$: " + valor);
        }
    }

    public static void main(String[] args) {
        double saldoInicial = 1500.00;

        ContaBancaria contaBancaria = new ContaBancaria(saldoInicial, "0022");

        System.out.println("Saldo atual R$: " + saldoInicial +"\n");

        System.out.println("---Depósito---");
        contaBancaria.depositar(500.00);
        System.out.println("Seu saldo atual é de R$: " + contaBancaria.saldo + "\n");

        System.out.println("---Saque---");
        contaBancaria.sacar(100.00);
        System.out.println("Saldo após saque R$: " + contaBancaria.saldo + "\n");

        contaBancaria.sacar(2000.00);
    }
}
