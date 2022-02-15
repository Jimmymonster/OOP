import java.util.*;
import java.math.*;
class Stopwatch{
    private double startTime,endTime;
    //===========================
    public Stopwatch(){
        this.startTime = 0;
        this.endTime = 0;
    }
    //===========================
    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
class Pro3{
    public static void printList(double[] list){
        for(int i=0;i<5;i++)
            System.out.print(list[i]+" ");
        System.out.println();
        for(int i=5;i<10;i++)
            System.out.print(list[i]+" ");
        System.out.println();
        System.out.println("...");
        for(int i=990;i<995;i++)
            System.out.print(list[i]+" ");
        System.out.println();
        for(int i=995;i<1000;i++)
            System.out.print(list[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        System.out.println("Creating a list containing 1000 elements,");
        Stopwatch sw = new Stopwatch();
        double[] list = new double[1000];
        for(int i=0;i<1000;i++){
            list[i] = (double)Math.random()*1000;
            list[i] = (double)Math.round(list[i]*100)/100;
        }
        printList(list);
        System.out.println("List created");
        sw.start();
        System.out.println("Sorting stopwatch starts...");
        for(int i=0;i<1000;i++){
            int min =i;
            for(int j=i+1;j<1000;j++){
                if(list[j]<list[min]){
                    min=j;
                }
            }
            if(min!=i){
                double temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
        printList(list);
        sw.stop();
        System.out.println("Sorting stopwatch stoped");
        System.out.println("The sort time is "+sw.getElapsedTime()+" milliseconds");
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromePrime stopwatch starts...");
        sw.start();
        long n=2;
        int cou=0;
        while(cou<1000){
            boolean isprime=true,ispalin=false;
            for(long i=2;i*i<=n;i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }
            long reverse=0;
            long temp=n;
            while(temp>0){
                reverse=reverse*10+temp%10;
                temp=temp/10;
            }
            if(n==reverse){
                ispalin=true;
            }
            if(isprime&&ispalin){
                cou++;
                System.out.print(n+" ");
                if(cou%10==0)
                    System.out.println();
            }
            if(n==2) n=3;
            else n+=2;
        }
        System.out.println("PalindromePrime created.");
        sw.stop();
        System.out.println("The palindromePrime stopwatch stoped");
        System.out.println("The palindromePrime time is "+sw.getElapsedTime()+" milliseconds");
    }
}