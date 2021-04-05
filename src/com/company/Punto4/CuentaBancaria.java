package com.company.Punto4;

import java.util.Scanner;

public class CuentaBancaria {
    private int id;
    private String name;
    private double balance;

    public CuentaBancaria(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void Credit(double balance) {
        double deposit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you want to put in an account?");
        deposit = scanner.nextDouble();
        setBalance(deposit + balance);
    }

    public void Debit(double balance) {
        double debit;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto dinero tienes que pagar?");
        debit = scanner.nextDouble();
        if (debit < balance) {
            setBalance(balance - debit);
        } else {
            System.out.println("No hay dinero suficiente");
        }
    }
    public void ShowStats(){
        System.out.println("Name: "+getName());
        System.out.println("ID: "+getId());
        System.out.println("Balance: "+getBalance());
    }
}
