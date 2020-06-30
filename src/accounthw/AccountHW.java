/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounthw;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author User
 */
public class AccountHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
      Account max = new Account("489",20045, "$");
      Account Katya = new Account("145",4789, "$");
      
      
      max.ShowAccountInfo();      
      max.PutMoney(500);
      
      max.ShowAccountInfo();      
      max.WithdrawMoney(300);
      
      max.ShowAccountInfo();      
      Katya.ShowAccountInfo();
      
      max.MakeTransaction(Katya,1000);
      
      max.ShowAccountInfo();      
      Katya.ShowAccountInfo();
    }
    
}
