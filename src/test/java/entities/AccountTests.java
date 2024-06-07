/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import com.mycompany.aulajunit.entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author anton
 */
public class AccountTests {
    
    @Test
    public void depositShouldIncreseBalanceWhenPositiveAmount(){
    
       double amount = 200.0;
       double expectedValue = 196.0;
       Account acc = new Account(1L, 0.0);
       
       acc.deposit(amount);
       
       Assertions.assertEquals(expectedValue, acc.getBalance());
       
    }
}

/*
git remote add origin https://github.com/toydala99/Estudano-JUnit.git
git push -u origin main
*/