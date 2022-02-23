import java.util.*;
public class Account1{
    private int id;
    private double balance;
    private double annualInterestRate=0;
    private Date dateCreated;
    //constructors
    public Account1(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    public Account1(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    //accessors
    public int getId()                      {return id;}
    public double getBalance()              {return balance;}
    public double getAnnualInterestRate()   {return annualInterestRate;}
    public Date getdateCreated()            {return dateCreated;}
    public double getMonthlyInterestRate()  {return annualInterestRate/12;}
    public double getMonthlyInterest()      {return balance*getMonthlyInterestRate();}
    //mutators
    public void setID(int id)               {this.id = id;}
    public void setBalance(double balance)  {this.balance = balance;}
    public void setAnnualInterestRate(double annualInterestRate){this.annualInterestRate=annualInterestRate;}
    //functions
    public void withdraw(double amount){
        if(balance<amount){
            System.out.println("Insufficient funds");
        }
        else{
            balance -= amount;
        }
    }
    public void deposit(double amount){
        if(amount<0){
            System.out.println("Invalid amount");
        }
        else{
            balance += amount;
        }
    }
    public String toString(){
        return "Account ID: " + id 
        + "\nBalance: " + balance 
        + "\nMonthly Interest: " + getMonthlyInterest()
        + "\nDate Created: " + dateCreated;
    }
}
