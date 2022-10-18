import java.nio.file.SecureDirectoryStream;
import java.util.Scanner;

abstract class Account {
    String Accno,name;
    double balance;
    abstract void displayBalance();
    abstract void deposite();
    abstract void withdraw(); 
}
class SavingAccount extends Account{
   String type; float int_rate;
   void CalculateInterest()
   {
      
   }
}
class CurrentAccount extends Account{
    String type; float int_rate;
   void CalculateInterest()
   {
      
   }
}

