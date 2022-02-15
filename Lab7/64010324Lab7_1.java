import java.util.*;
class Account1{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account1(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    public Account1(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public Date getdateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterest(){
        return balance*getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        if(balance<amount){
            System.out.println("Insufficient funds");
        }
        else{
            balance -= amount;
        }
    }
    public void deposit(double amount){
        balance += amount;
    }
}
class checking extends Account1{
    
}
class saving extends Account1{
    
}
class Pro1{
    public static void main(String args[]){
      //  Account a = new Account(1122,20000,4.5);
    }
}