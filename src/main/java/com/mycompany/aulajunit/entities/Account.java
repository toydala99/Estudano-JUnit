/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulajunit.entities;

/**
 *
 * @author anton
 */
public class Account {
    
    public static double FEES = 0.02;
    
    private Long id;
    private double balance;
    
    public Account(){}

    public Account(Long id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount){
        if(amount>0){
            amount -= amount * FEES;
            balance += amount;
        }
    }
    
    public void withdraw(double amount){
        if(amount > balance){
            throw new IllegalArgumentException();
        }
        balance -= amount;
    }
    
    public double fullWithDraw(){
        double aux = balance;
        balance = 0.0;
        return aux;
    }
}
