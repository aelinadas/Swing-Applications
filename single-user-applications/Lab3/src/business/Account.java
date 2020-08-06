/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.Date;

/**
 *
 * @author aelinadas
 */
public class Account {
    private String routingNumer;
    private String accountNumber;
    private String bankName;
    private int balance;
    private Date createdOn;
    
    public Account(){
        this.createdOn = new Date();
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public String getRoutingNumer() {
        return routingNumer;
    }
    public void setRoutingNumer(String routingNumer) {
        this.routingNumer = routingNumer;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    @Override
    public String toString(){
        return bankName;
    }
}
