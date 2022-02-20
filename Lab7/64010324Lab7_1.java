import java.util.*;
class Account1{
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
        balance += amount;
    }
    public String toString(){
        return "Account ID: " + id 
        + "\nBalance: " + balance 
        + "\nMonthly Interest: " + getMonthlyInterest()
        + "\nDate Created: " + dateCreated;
    }
}
class Checking extends Account1{
    private double overdraft_limit=0;
    //constructors
    public Checking(){
        super();
    }
    public Checking(int id,double balance,double overdraft_limit){
        super(id,balance);
        this.overdraft_limit = overdraft_limit;
    }
    //accessors
    public double getoverdraft_limit(){return overdraft_limit;}
    //mutators
    public void setoverdraft_limit(double overdraft_limit){this.overdraft_limit = overdraft_limit;}
    //functions
    public void withdraw(double amount){
        if(getBalance()<amount+overdraft_limit){
            System.out.println("Insufficient funds");
        }
        else{
            setBalance(getBalance()-amount);
        }
    }
    public String toString(){
        return super.toString() + "\nOverdraft Limit: " + overdraft_limit;
    }
}
class Saving extends Account1{
    //constructors
    public Saving(){
        super();
    }
    public Saving(int id,double balance){
        super(id, balance);
    }
    //functions
    public void withdraw(double amount){
        if(getBalance()<amount){
            System.out.println("Insufficient funds");
        }
        else{
            setBalance(getBalance()-amount);
        }
    }
}
class Pro1{
    public static void main(String args[]){
        Account1 a1 = new Account1(1,100);
        Saving s1 = new Saving(2,200);
        Checking c1 = new Checking(3,300,-1000);
        a1.setAnnualInterestRate(1.5);
        s1.setAnnualInterestRate(1.5);
        c1.setAnnualInterestRate(1.5);

        a1.withdraw(100);
        s1.withdraw(100);
        c1.withdraw(100);

        a1.deposit(3000);
        s1.deposit(3000);
        c1.deposit(3000);

        System.out.println(a1);
        System.out.println(s1);
        System.out.println(c1);
    }
}