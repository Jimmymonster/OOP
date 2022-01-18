import java.util.*;
class main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines=in.nextInt();
        for(int i=0;i<lines;i++){
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