import java.util.*;
import java.math.*;
class Pro3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        boolean chrow=false,chcol=false,chdiag=false,chsuperdiag=false,chsubdiag=false;
        int n = in.nextInt();
        if(n<=0){
            System.out.println("Invalid input");
            System.exit(0);
        }
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]= (int)(Math.random()*2);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //checking for the rows
        for(int i=0;i<n;i++){
            int now;
            boolean ch=true;
            if(arr[i][0]==0) now = 0;
            else now = 1;
            for(int j=0;j<n;j++){
                if(arr[i][j]==0&&now==1) ch=false;
                if(arr[i][j]==1&&now==0) ch=false;
            }
            if(ch){
                chrow=true;
                System.out.println("All " +now+"s on row " +i);
            }
        }
        if(!chrow) System.out.println("No same number on row");
        //checking for the columns
        for(int i=0;i<n;i++){
            int now;
            boolean ch=true;
            if(arr[0][i]==0) now = 0;
            else now = 1;
            for(int j=0;j<n;j++){
                if(arr[j][i]==0&&now==1) ch=false;
                if(arr[j][i]==1&&now==0) ch=false;
            }
            if(ch){
                chcol=true;
                System.out.println("All " +now+"s on column " +i);
            }
        }
        if(!chcol) System.out.println("No same number on a column");
        //checking for the diagonals
        int now;
        boolean ch=true;
        if(arr[0][0]==0) now = 0;
        else now = 1;
        for(int i=0;i<n;i++){
            if(arr[i][i]==0&&now==1) ch=false;
            if(arr[i][i]==1&&now==0) ch=false;
        }
        if(ch){
            chdiag=true;
            System.out.println("All " +now+"s on diagonal");
        }
        if(!chdiag) System.out.println("No same number on the diagonal");
        //checking for the superdiagonals
        ch=true;
        if(arr[0][1]==0) now = 0;
        else now = 1;
        for(int i=1;i<n;i++){
            if(arr[i-1][i]==0&&now==1) ch=false;
            if(arr[i-1][i]==1&&now==0) ch=false;
        }
        if(ch){
            chsuperdiag=true;
            System.out.println("All " +now+"s on superdiagonal");
        }
        if(!chsuperdiag) System.out.println("No same number on the superdiagonal");
        //checking for the subdiagonals
        ch=true;
        if(arr[1][0]==0) now = 0;
        else now = 1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1][i]==0&&now==1) ch=false;
            if(arr[i+1][i]==1&&now==0) ch=false;
        }
        if(ch){
            chsubdiag=true;
            System.out.println("All " +now+"s on subdiagonal");
        }
        if(!chsubdiag) System.out.println("No same number on the subdiagonal");
    }
}