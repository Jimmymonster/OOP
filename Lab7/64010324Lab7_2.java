import java.util.*;
class Account2{
    private int id;
    String name="unknown";
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    ArrayList<transactions> transactions = new ArrayList<transactions>();
    public Account2(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    public Account2(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }
    public Account2(String name,int id,double balance,double annualInterestRate){
        this.name = name;
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
    public void printlog(){
        System.out.println("Date                                Type        Amount       Balance");    
        for(int i=0;i<transactions.size();i++){
            System.out.print(transactions.get(i).getDate());
            System.out.print("        ");
            System.out.print(transactions.get(i).getType());
            System.out.print("           ");
            System.out.print(transactions.get(i).getAmount());
            for(int j=0;j<13-String.valueOf(transactions.get(i).getAmount()).length();j++)
                System.out.print(" ");
            System.out.println(transactions.get(i).getBalance());
        }
    }
    public void withdraw(double amount){
        if(balance<amount){
            System.out.println("Insufficient funds");
        }
        else{
            balance -= amount;
            transactions.add(new transactions('W',amount,balance,"withdraw"));
        }
    }
    public void deposit(double amount){
        balance += amount;
        transactions.add(new transactions('D',amount,balance,"Deposit"));
    }
}
class transactions{
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
class Pro2 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Name: ");
        String name=in.nextLine();
        System.out.print("Account ID: ");
        int id=in.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate=in.nextDouble();
        System.out.print("Balance: ");
        double balance=in.nextDouble();
        Account2 a = new Account2(name,id,balance,annualInterestRate);
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        a.printlog();
    }
}
