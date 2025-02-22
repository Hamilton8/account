package model.entities;

import model.exceptions.MisMatchBalanceException;
import model.exceptions.WithdrawLimitException;

public class Account {
    final private String holder;
    final private Integer accountNumber;
    private Double balance;
    private Double withdrawLimit;

  public Account(String holder, int accountNumber, double balance, double withdrawLimit){
      this.holder = holder;
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.withdrawLimit = withdrawLimit;
  }

  public String getHolder(){
      return holder;
  }
  public Integer getAccountNumber(){
      return accountNumber;
  }
  public Double getBalance(){
      return balance;
  }
  public Double getWithdrawLimit(){
      return withdrawLimit;
  }

  public void setBalance(double balance){
      this.balance = balance;
  }
  public void setWithdrawLimit(double withdrawLimit){
      this.withdrawLimit = withdrawLimit;
  }

  public void deposit(double amount){
      if(amount<0){
          throw new IllegalArgumentException("Ivalid typed amount");
      }
      balance = balance+amount;
  }

  public void withdrawCash(double amount){
      if(amount<0){
          throw new IllegalArgumentException("Ivalid typed amount");
      }
      if(!(balance>0 && amount<balance)){
         throw new MisMatchBalanceException("Balance not available");
      }
      if(amount>withdrawLimit){
          throw new WithdrawLimitException("Withdraw limit exceeded");
      }
      balance = balance - amount;
  }

  public double checkBalance(){
      return this.getBalance();
  }
}
