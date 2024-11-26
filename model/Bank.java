package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="bank")
public class Bank {
    @Id
    @Column(name="accNo")
    private int accNo;
    @Column(name="name")
    private String name;
    @Column(name="balance")
    private double balance;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
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
}
