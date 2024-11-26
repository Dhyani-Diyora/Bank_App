package com.example.demo.controller;

import com.example.demo.model.Bank;
import com.example.demo.service.bankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bank")
public class bankController {
    @Autowired
    bankService bService;

    @PostMapping("openAcc")
    public void openAcc(@RequestBody Bank b){
        bService.openAccount(b);
    }

    @PutMapping("withdraw/{accNo}")
    public void withdraw(@PathVariable int accNo,@RequestBody Bank bank){
        bService.withdraw(accNo, bank);
    }

    @PutMapping("deposite/{accNo}")
    public void deposite(@PathVariable int accNo,@RequestBody Bank bank){
        bService.deposit(accNo, bank);
    }

    @GetMapping("display")
    public List<Bank> display(){
        return bService.display();
    }

    @PutMapping("transfer/{accNo}")
    public void transfer(@PathVariable int accNo,@RequestBody Bank bank){
        bService.transfer(accNo, bank);
    }
}
