/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounthw;

/**
 *
 * @author User
 */
public class Account {
    private String AccountNumber;
    private int Money;
    private String Currency;
    
    public Account(String AccountNumber, int Money, String Currency){
        this.AccountNumber = AccountNumber;
        this.Money = Money;
        this.Currency = Currency;
    }
    
    public void WithdrawMoney(int money){
        if(this.Money>money){
            this.Money-=money;
            System.out.println("Your money has been successfully withdrawn.");
        }else{
            System.out.println("You don't have enough money to withdrawn.");
        }
    }
    public void PutMoney(int money){
        this.Money += money;
        System.out.println("Your money successfully putted.");
    }
    public void ShowAccountInfo(){
        System.out.println("Account Number: " + this.AccountNumber + "\nMoney: " + this.Money + " " + this.Currency);
    }
    
    public void MakeTransaction(Account acc, int money){
        if(this.Money>money){
            this.WithdrawMoney(money);
            acc.PutMoney(money);
        }else{
            System.out.println("You don't have enough money to take.");
        }
    }
}