import java.util.*;
import java.math.*;
class test1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Input size of matrix: ");
        int n = in.nextInt();
        if(n<3){
            System.out.println("Invalid input,please enter a number greater than 2");
            return;
        }
        int max=-1,maxi=0,maxj=0;
        int[][] arr=new int[n][n];
        System.out.println("Random matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=(int)(Math.random()*10);
                if(arr[i][j]>max){
                    max=arr[i][j];
                    maxi=i;
                    maxj=j;
                } 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("The first found largest member is: "+max+" at ("+maxi+","+maxj+")");
        System.out.print("(a) Members on Top : ");
        if(maxi==0) System.out.println("NO");
        else{
            for(int i=maxi-1;i>=0;i--){
                System.out.print(arr[i][maxj]);
                if(i!=0) System.out.print(", ");
            }
            System.out.println();
        }
        System.out.print("(b) Members on the Right Hand Side : ");
        if(maxj==n-1) System.out.println("NO");
        else{
            for(int j=maxj+1;j<n;j++){
                System.out.print(arr[maxi][j]);
                if(j!=n-1) System.out.print(", ");
            }
            System.out.println();
        }
        System.out.print("(c) Members on the Bottom : ");
        if(maxi==n-1) System.out.println("NO");
        else{
            for(int i=maxi+1;i<n;i++){
                System.out.print(arr[i][maxj]);
                if(i!=n-1) System.out.print(", ");
            }
            System.out.println();
        }
        System.out.print("(d) Members on the Left Hand Side : ");
        if(maxj==0) System.out.println("NO");
        else{
            for(int j=maxj-1;j>=0;j--){
                System.out.print(arr[maxi][j]);
                if(j!=0) System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println("End of program.");
    }
}