import java.util.*;
class test2{
    public static void main(String args[]){
        char[] num={'0','1','2','3','4','5','6','7','8','9'};
        char[] alpha={'a','b','c','d','e','f','g','h','i','j'};
        boolean[] marknum=new boolean[10];
        boolean[] markalpha=new boolean[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Random characters are : ");
        int first=(int)(Math.random()*2);
        for(int i=0;i<10;i++){
            int rand=(int)(Math.random()*10);
            if(i%2==first){
                markalpha[rand]=true;
                System.out.print(alpha[rand]+" ");
            }
            if(i%2==1-first){
                marknum[rand]=true;
                System.out.print(num[rand]+" ");
            }
        }
        System.out.println();
        System.out.print("Select group of characters [1] character or [2] numeric: ");
        int choice=in.nextInt();
        if(choice==1){
            System.out.print("Characters not in the list are :");
            for(int i=0;i<10;i++){
                if(!markalpha[i]) System.out.print(alpha[i]+" ");
            }
            System.out.println();
        }
        else if(choice==2){
            System.out.print("Numeric not in the list are :");
            for(int i=0;i<10;i++){
                if(!marknum[i]) System.out.print(num[i]+" ");
            }
            System.out.println();
        }
        else{
            System.out.println("Invalid input, please enter 1 or 2");
            return;
        }
        System.out.println("End of program.");
    }
}