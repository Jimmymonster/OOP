import java.util.*;
class ProExtra{
    public static void main(String args[]){
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if((i&1)==1){
                int a=(i+1)/2;
                System.out.print((a*a-a+1)+" ");
            }
            else{
                System.out.print(i/2*3+" ");
            }
        }
    }
}