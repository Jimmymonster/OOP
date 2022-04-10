import java.util.Scanner;
class pro1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a color: ");
        String color = in.next();
        System.out.print("Enter a filled(true/false): ");
        boolean filled = in.nextBoolean();
        while(true){
            System.out.print("Enter three sides: ");
            double side1 = in.nextDouble();
            double side2 = in.nextDouble();
            double side3 = in.nextDouble();
            try{
                Triangle t = new Triangle(side1,side2,side3,color,filled);
                System.out.println(t);
                break;
            }
            catch(IllegalTriangleException e){
                System.out.println(e);
            }
        }
    }
}