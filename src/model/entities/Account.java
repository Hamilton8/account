package model.entities;

public class Account {
    final private String holder;
    final private Integer accountNumber;
    private Double balance;
    private Double withdrawLimit;

  public Account(String holder, Integer accountNumber, Double balance, Double withdrawLimit){
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

  public void setBalance(Double balance){
      this.balance = balance;
  }
  public void setWithdrawLimit(Double withdrawLimit){
      this.withdrawLimit = withdrawLimit;
  }

  public void deposit(double amount){
      balance = balance+amount;
  }

  public void withdrawCash(double amount) throws Exception{
      if(!(balance>0 && amount<balance)){
         throw new Exception("Bandido");
      }
      if(amount>withdrawLimit){
          throw new Exception("Do not test me");
      }
      balance = balance - amount;
  }

  public double checkBalance(){
      return this.getBalance();
  }
}
