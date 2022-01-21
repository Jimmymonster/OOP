import java.util.*;
class Pro3{
    public static void main(String args[]){
        String[] a=new String[1000];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        boolean chrow=false,chcol=false,chdiag=false,chsuperdiag=false,chsubdiag=false;
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for(int i=0;i<n;i++){
            a[i] = in.nextLine();
        }
        //checking for the rows
        for(int i=0;i<n;i++){
            int now;
            boolean ch=true;
            if(a[i].charAt(0)=='0') now = 0;
            else now = 1;
            for(int j=0;j<n;j++){
                if(a[i].charAt(j)=='0'&&now==1) ch=false;
                if(a[i].charAt(j)=='1'&&now==0) ch=false;
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
            if(a[0].charAt(i)=='0') now = 0;
            else now = 1;
            for(int j=0;j<n;j++){
                if(a[j].charAt(i)=='0'&&now==1) ch=false;
                if(a[j].charAt(i)=='1'&&now==0) ch=false;
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
        if(a[0].charAt(0)=='0') now = 0;
        else now = 1;
        for(int i=0;i<n;i++){
            if(a[i].charAt(i)=='0'&&now==1) ch=false;
            if(a[i].charAt(i)=='1'&&now==0) ch=false;
        }
        if(ch){
            chdiag=true;
            System.out.println("All " +now+"s on diagonal");
        }
        if(!chdiag) System.out.println("No same number on the diagonal");
        //checking for the superdiagonals
        ch=true;
        if(a[0].charAt(0)=='0') now = 0;
        else now = 1;
        for(int i=1;i<n;i++){
            if(a[i-1].charAt(i)=='0'&&now==1) ch=false;
            if(a[i-1].charAt(i)=='1'&&now==0) ch=false;
        }
        if(ch){
            chsuperdiag=true;
            System.out.println("All " +now+"s on superdiagonal");
        }
        if(!chsuperdiag) System.out.println("No same number on the superdiagonal");
        //checking for the subdiagonals
        ch=true;
        if(a[0].charAt(0)=='0') now = 0;
        else now = 1;
        for(int i=0;i<n-1;i++){
            if(a[i+1].charAt(i)=='0'&&now==1) ch=false;
            if(a[i+1].charAt(i)=='1'&&now==0) ch=false;
        }
        if(ch){
            chsubdiag=true;
            System.out.println("All " +now+"s on subdiagonal");
        }
        if(!chsubdiag) System.out.println("No same number on the subdiagonal");
    }
}