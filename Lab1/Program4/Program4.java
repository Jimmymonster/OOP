import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight in pounds : ");
        float weight = in.nextFloat();
        weight*=0.45359237;
        System.out.print("Enter height in inches : ");
        float height = in.nextFloat();
        height*=0.0254;
        if(height<=0) System.out.println("Invalid height");
        else if(weight<=0) System.out.println("Invalid weight");
        else System.out.println("BMI is :" + (weight/(height*height)));
    }
}