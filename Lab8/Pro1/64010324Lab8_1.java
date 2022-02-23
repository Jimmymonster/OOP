import java.util.Scanner;
class Pro1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int[] sides=new int[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter the length of side "+(i+1)+" : ");
            sides[i]=in.nextInt();
        }
        System.out.print("Enter the color : ");
        String Color=in.next();
        System.out.print("Enter the filled status : ");
        boolean filled=in.nextBoolean();
        Triangle t=new Triangle(sides[0],sides[1],sides[2],Color,filled);
        System.out.println(t);
    }
}