package application;

import model.entities.Account;
import model.exceptions.MisMatchBalanceException;
import model.exceptions.WithdrawLimitException;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Welcome to account program");
            System.out.println("Enter the name of the account holder");
            String name = input.next();
            System.out.println("Enter the number of the account");
            int num = input.nextInt();
            System.out.println("Enter the amount you want to deposit");
            double sald = input.nextDouble();
            Account account = new Account(name, num,sald, 20000);
            account.withdrawCash(-100);
            System.out.println(account);
        }
        catch (IllegalArgumentException | MisMatchBalanceException | WithdrawLimitException e){
            System.out.println(e.getMessage());
        }
    }
}
