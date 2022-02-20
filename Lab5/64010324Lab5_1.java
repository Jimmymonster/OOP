import java.util.*;
class Pro1{
    public static void main(String args[]){
        Account a1 = new Account(1122,20000);
      /*  Scanner in=new Scanner(System.in);
        while(true){
            System.out.print("1=deposit 2=withdrawn 3=exit\nYour choice:");
            int opr=in.nextInt(); //1 deposit, 2 withdrawn
            double amount;
            if(opr==1){
                System.out.print("deposit amount:");
                amount=in.nextDouble();
                a1.deposit(amount);
            }
            else if(opr==2){
                System.out.print("withdrawn amount:");
                amount=in.nextDouble();
                a1.withdraw(amount);
            }
            else if(opr==3) break;
            else{
                System.out.println("Input only 1,2,3");
            }
        }*/
        a1.setAnnualInterestRate(4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println(a1);
    }
}