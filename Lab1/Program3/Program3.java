import java.util.*;
class Main{
    public static void main(String args[]){
        System.out.print("Enter the number between 0 and 1000 : ");
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        if(a<0||a>1000) System.out.println("Value out of range.");
        else
        System.out.print("The sum of the digits is :" + (a%10+a/10%10+a/100%10+a/1000%10));
    }
}