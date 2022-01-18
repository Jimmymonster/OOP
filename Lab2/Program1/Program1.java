import java.util.*;
class main{
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        String[] days= new String[7];
        days[0]="Sunday";
        days[1]="Monday";
        days[2]="Tuseday";
        days[3]="Wednesday";
        days[4]="Thursday";
        days[5]="Friday";
        days[6]="Saturday";
        System.out.print("Enter today's day : ");
        int now=in.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        int next=in.nextInt();
        System.out.println("Today is "+ days[now%7] + " and the future is " + days[(now+next)%7]);
    }
}