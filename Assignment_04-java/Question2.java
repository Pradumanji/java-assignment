import java.util.*;

public class Question2 {

  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    String accno,name;
    double balance;
    String type; 
    int interest, ammount;

    System.out.println("\t\t-:Enter The Saving Account Details:-\n\n ");

    System.out.println("Enter The Account Type:- ");
    type = sc.nextLine();

    System.out.println("Enter the Account Number:- ");
    accno = sc.nextLine();

    System.out.println("Enter The Consumer Name:- ");
    name = sc.nextLine();

    System.out.println("-:Enter The Balance:- ");
    balance = sc.nextDouble();

    System.out.println("Enter the Interest:- ");
    interest = sc.nextInt();

    SavingAccount sa = new SavingAccount(accno, name, type, interest, balance);
    sa.displayBalance();

    System.out.println("\nEnter the Ammount To Deposit:- ");
    ammount = sc.nextInt();
    sa.deposit(ammount);

    System.out.println("Enter the Ammount To Withdraw:- ");
    ammount = sc.nextInt();
    sa.withdraw(ammount);


    System.out.println("\t\t-:Enter The Current Account Details:- ");

    System.out.println("Enter The Account Type:- ");
    sc.nextLine();
    type = sc.nextLine();

    System.out.println("Enter the Account Number:- ");
    accno = sc.nextLine();

    System.out.println("Enter The Consumer Name:- ");
    name = sc.nextLine();

    System.out.println("-:Enter The Balance:- ");
    balance = sc.nextDouble();

    System.out.println("Enter the Interest:- ");
    interest = sc.nextInt();

    CurrentAccount ca = new CurrentAccount(accno, name, type, interest, balance);
    ca.displayBalance();

    System.out.println("\nEnter the Ammount To Deposit:- ");
    ammount = sc.nextInt();
    ca.deposit(ammount);

    System.out.println("Enter the Ammount To Withdraw:- ");
    ammount = sc.nextInt();
    ca.withdraw(ammount);

    



    
  }
    
}

abstract class Account
{
     String accno,name;
     Double balance;
     Account(String accno, String name, Double balance)
     {
       this.accno = accno;
       this.name = name;
       this.balance = balance;
     }
     abstract void displayBalance();
     abstract void deposit(int ammount);
     abstract void withdraw(int ammount);
}

class SavingAccount extends Account
{
    String type; 
    int interest;

    SavingAccount(String accno, String name, String type, int interest, double balance)
    {
      super(accno, name, balance);
      this.type = type;
      this.interest = interest;
    }

    void displayBalance()
    {
		System.out.println("Account Number: "+ accno+"\nName: "+name+"\nBalance: "+balance);
    }
    
    void deposit(int ammount)
    {
      balance+= ammount;
      System.out.println("Ammount Deposited\nCurrent Balance is :- "+balance);
    }
    void withdraw(int ammount)
    {
      if(balance>ammount)
      {
        balance-=ammount;
        System.out.println("Ammount Withdrawed\nCurrent Balance is :- "+balance);
      }
      else
      System.out.println("Insufficient Ammount\nCurrent Balance is :- "+balance);

    }

    public void calculateinterest(int period)
    {
      double si;
      si= (balance * interest * period )/100;
      System.out.println("Interest of Saving Account: - "+si);
    }

   

}


class CurrentAccount extends Account
{
  String type; 
  int interest;

  CurrentAccount(String accno, String name, String type, int interest, double balance)
  {
    super(accno, name, balance);
    this.type = type;
    this.interest = interest;
  }


  void displayBalance()
  {
    System.out.println("\t\tCurrent Account Detail:-\n");

    System.out.println("Account Number: "+ accno+"\nName: "+name+"\nBalance: "+balance);
  }
  
  void deposit(int ammount)
  {
    balance+= ammount;
    System.out.println("Ammount Deposited\nCurrent Balance is :- "+balance);
  }
  void withdraw(int ammount)
  {
    if(balance>ammount)
    {
      balance-=ammount;
      System.out.println("Ammount Withdrawed\nCurrent Balance is :- "+balance);
    }
    else
    System.out.println("Insufficient Ammount\nCurrent Balance is :- "+balance);

  }

  public void calculateinterest(int period)
  {
    double si;
    si= (balance * interest * period )/100;
    System.out.println("Interest of Current Account: - "+si);
  }



}