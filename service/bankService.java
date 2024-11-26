package com.example.demo.service;

import com.example.demo.model.Bank;
import com.example.demo.repository.bankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class bankService {
    @Autowired
    bankRepository bRepository;

    public void openAccount(Bank bank){
        bRepository.save(bank);
    }

    public void withdraw(int accNo,Bank bank){
        Bank b=bRepository.findById(accNo).get();
        b.setBalance(b.getBalance()- bank.getBalance());
        bRepository.save(b);
    }

    public void deposit(int accNo,Bank bank){
        Bank b=bRepository.findById(accNo).get();
        b.setBalance(b.getBalance()+ bank.getBalance());
        bRepository.save(b);
    }

    public List<Bank> display(){
        return bRepository.findAll();
    }

    public void transfer(int accNo, Bank bank) {
        Bank minus=bRepository.findById(accNo).get();
        int  accNo1=bank.getAccNo();
        Bank plus=bRepository.findById(accNo1).get();
        minus.setBalance(minus.getBalance()- bank.getBalance());
        plus.setBalance(plus.getBalance()+ bank.getBalance());
        bRepository.save(minus);
        bRepository.save(plus);
    }
}
