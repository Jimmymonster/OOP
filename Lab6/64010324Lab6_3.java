import java.util.*;
class Pro6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int id;
        while(true){
            System.out.print("Enter an id: ");
            id = sc.nextInt();
            if(id<0||id>9) System.out.println("Invalid id");
            else break;
        }
        Account[] acc = new Account[10];
        for(int i=0;i<9;i++){
            acc[i]=new Account(i,100);
        }
        while(true){
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");
            int opr = sc.nextInt();
            if(opr==1){
                System.out.println("The balance is "+acc[id].getBalance());
            }
            else if(opr==2){
                double amount;
                while(true){
                    System.out.print("Enter an amount to withdraw: ");
                    amount = sc.nextDouble();
                    if(amount<0||acc[id].getBalance()-amount<0) System.out.println("Invalid amount");
                    else break;
                }
                acc[id].withdraw(amount);
            }
            else if(opr==3){
                double amount;
                while(true){
                    System.out.print("Enter an amount to deposit: ");
                    amount = sc.nextDouble();
                    if(amount<0) System.out.println("Invalid amount");
                    else break;
                }
                acc[id].deposit(amount);
            }
            else if(opr==4) break;
            else System.out.println("Invalid choice");
            System.out.println();
        }
        System.out.println("End of program");
    }
}
