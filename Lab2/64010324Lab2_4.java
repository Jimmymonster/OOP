import java.util.*;
class Pro4{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines=in.nextInt();
        if(lines<1||lines>15) System.out.println("Invalid num");
        for(int i=0;i<lines;i++){
            //for input > 10
            if(lines>=10&&i<9) for(int k=0;k<lines-9;k++) System.out.print(" ");
            if(lines>=10&&i>=9) for(int k=0;k<lines-i-1;k++) System.out.print(" ");
            //===============================================================
            for(int j=0;j<lines*2-1;j++){  
                if(j<lines&&i>=lines-j-1) System.out.print(lines-j);
                else if(j>=lines&&i>j-lines) System.out.print(j-lines+2);
                else System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}