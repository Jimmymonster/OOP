import java.util.Date;
public class transactions{
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;
    transactions(char type,double amount,double balance,String description){
       this.type=type;
       this.amount=amount;
       this.balance=balance;
       this.description=description;
       date=new Date();
    }
    public Date getDate(){return date;}
    public double getAmount(){return amount;}
    public double getBalance(){return balance;}
    public char getType(){return type;}
}
