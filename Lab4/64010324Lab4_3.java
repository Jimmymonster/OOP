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
    public static void printList(float[] list){
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
        float[] list = new float[1000];
        for(int i=0;i<1000;i++){
            list[i] = (float)Math.random()*1000;
            list[i] = (float)Math.round(list[i]*100)/100;
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
                float temp = list[i];
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
        int[] prime=new int[200000]; // 0=prime 1=not prime
        prime[0]=prime[1]=1;
        for(int i=2;i<200000;i++){
            if(prime[i]==0){
                //unmark all multiples of i
                if(i<1000){
                    for(int j=i*i;j<200000;j+=i){
                        prime[j]=1;
                    }
                }
                //check palindrome
                int temp=i,reverse=0;
                while(temp>0){
                    reverse=reverse*10+temp%10;
                    temp/=10;
                }
                if(i!=reverse) prime[i]=1;
            }
        }
        int k=1;
        for(int i=0;i<10;i++){
            int j=10;
            while(j>0){
                k++;
                if(prime[k]==0){
                    System.out.print(k+" ");
                    j--; 
                }
            }
            System.out.println();
        }
        System.out.println("PalindromePrime created.");
        sw.stop();
        System.out.println("The palindromePrime stopwatch stoped");
        System.out.println("The palindromePrime time is "+sw.getElapsedTime()+" milliseconds");
    }
}