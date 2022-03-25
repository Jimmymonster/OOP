import java.util.Scanner;
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
        Account2 a = new Account2(name,id,balance);
        a.setAnnualInterestRate(annualInterestRate);
        a.deposit(30);
        a.deposit(40);
        a.deposit(50);
        a.withdraw(5);
        a.withdraw(4);
        a.withdraw(2);
        a.printlog();
    }
}
