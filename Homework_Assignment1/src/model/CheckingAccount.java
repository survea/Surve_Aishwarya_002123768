/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aishwarya
 */
public class CheckingAccount {
    private String bankName;
    private String bankRoutingNum;
    private int bankAccNum;
    private double accountBalance;
    private String accountType;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankRoutingNum() {
        return bankRoutingNum;
    }

    public void setBankRoutingNum(String bankRoutingNum) {
        this.bankRoutingNum = bankRoutingNum;
    }

    public int getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(int bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
