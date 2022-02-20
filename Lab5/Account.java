import java.util.Date;
public class Account {
    //variables
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;
    private Date dateCreated;
    //constructor
    public Account(){
        dateCreated = new Date();
    }
    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    //accessor
    public int getId()                      {return id;}
    public double getBalance()              {return balance;}
    public double getAnnualInterestRate()   {return annualInterestRate;}
    public Date getdateCreated()            {return dateCreated;}
    //mutator
    public void setID(int id)               {this.id = id;}
    public void setBalance(double balance)  {this.balance = balance;}
    public void setAnnualInterestRate(double annualInterestRate){this.annualInterestRate=annualInterestRate;}
    //function
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
        if(amount<0){
            System.out.println("Invalid amount");
        }
        else{
            balance += amount;
        }
    }
    public String toString(){
        return "Balance is "+this.getBalance() +
        "\nMonthly interest is "+this.getMonthlyInterest()+
        "\nDate created is "+this.getdateCreated();
    }
}
