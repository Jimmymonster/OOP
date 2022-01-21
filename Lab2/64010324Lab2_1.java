import java.util.*;
class Pro1{
    public static void main(String args[]){
        //JUST TELL MY SELF THAT DON'T USE ARRAY
        Scanner in =new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int now=in.nextInt();
        System.out.print("Enter the number of days elapsed since today : ");
        int next=in.nextInt();
        if(now<0||next<0) System.out.println("Invalid date");
        else{
        String today="",nextday="";
        if(now%7==0) today="Sunday";
        else if(now%7==1) today="Monday";
        else if(now%7==2) today="Tuesday";
        else if(now%7==3) today="Wednesday";
        else if(now%7==4) today="Thursday";
        else if(now%7==5) today="Friday";
        else if(now%7==6) today="Saturday";
        now=(now+next)%7;
        if(now%7==0) nextday="Sunday";
        else if(now%7==1) nextday="Monday";
        else if(now%7==2) nextday="Tuesday";
        else if(now%7==3) nextday="Wednesday";
        else if(now%7==4) nextday="Thursday";
        else if(now%7==5) nextday="Friday";
        else if(now%7==6) nextday="Saturday";
        System.out.println("Today is "+today+" and the future is "+nextday);
        }
    }
}