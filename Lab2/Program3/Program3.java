import java.util.*;
class main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int h;
        float q,m,j,k,y;
        String[] days={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.print("Enter day : "); q=(float)in.nextInt();
        System.out.print("Enter month : "); m=(float)in.nextInt();
        System.out.print("Enter year : "); y=(float)in.nextInt();
        if(m>12){
            m--;
            y+=m/12; m%=12;
            m++;
        }
        if((y%4==0 && y%100!=0)||y%400==0) months[1]=29;
        if(q<=0 || q>months[(int)(m-1)]){
            System.out.println("Invalid date");
        }
        else{
            j=y/100;
            k=y%100;
            h=(int)(q+26*(m+1)/10+k/4+j/4+5*j)%7;
            System.out.println("The day of week is "+days[h]);
        }
    }
}