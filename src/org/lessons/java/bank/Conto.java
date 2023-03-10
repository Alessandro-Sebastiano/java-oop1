package org.lessons.java.bank;

import javax.security.auth.login.AccountException;
import java.text.DecimalFormat;
import java.util.Random;

public class Conto {

    private int accountNum;
    private String accountName;
    private double balance;

    public Conto(String accountName){

        this.accountNum = generateAccountNum();
        this.accountName = accountName;
        this.balance = 0.00;

    }

    private int generateAccountNum(){
        Random rand = new Random();
        return rand.nextInt(1,1001);
    }

    public int getAccountNum() {
        return accountNum;
    }

    public String getAccountName(){
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public String getFormattedBalance(){

        DecimalFormat format = new DecimalFormat("$#0.00");
        return format.format(balance);

    }

    public String getAccountDetails(){

        return "Numero conto: " + accountNum + " / " + "Nome del conto: " + accountName+ " / " + "Saldo: " + getFormattedBalance();

    }

    public boolean deposit(int deposit){
        if(deposit > 0) {
            this.balance += deposit;
            return true;
        }else{
            return false;
        }
    }

    public boolean withdrawl(int withdrawl){
        if(withdrawl <= this.balance) {
            this.balance -= withdrawl;
            return true;
        }else{
            return false;
        }
    }

}
