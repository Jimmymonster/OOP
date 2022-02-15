import java.util.*;
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    public Account(int id,double balance,double annualInterestRate){
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
class Pro1{
    public static void main(String args[]){
        Account a1 = new Account(1122,20000,4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("Balance is "+a1.getBalance());
        System.out.println("Monthly interest is "+a1.getMonthlyInterest());
        System.out.println("Date created is "+a1.getdateCreated());
    }
}