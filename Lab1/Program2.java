import java.util.*;
class Pro2 {
    public static void main(String args[]){
        float a,b,c,d,e,f;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the value of a :");
        a=in.nextFloat();
        System.out.print("Enter the value of b :");
        b=in.nextFloat();
        System.out.print("Enter the value of c :");
        c=in.nextFloat();
        System.out.print("Enter the value of d :");
        d=in.nextFloat();
        System.out.print("Enter the value of e :");
        e=in.nextFloat();
        System.out.print("Enter the value of f :");
        f=in.nextFloat();
        if(a*d-b*c==0) System.out.println("This equalation is invalid.");
        else{
            System.out.println("x = " + ((e*d-b*f)/(a*d-b*c)));
            System.out.println("y = " + ((a*f-e*c)/(a*d-b*c)));
        }
    }
}