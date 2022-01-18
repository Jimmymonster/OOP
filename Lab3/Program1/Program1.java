import java.util.*;
import java.math.*;
class main{
    public static void main(String args[]){
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
    }
}