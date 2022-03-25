import java.util.Scanner;
class Pro2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double side1 = in.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = in.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = in.nextDouble();
        Triangle t = new Triangle(side1,side2,side3);
        System.out.println(t);
    }
}
