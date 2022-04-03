import java.util.Scanner;
class Pro2{
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.print("Creating circle 1, input radius: ");
        double r1=in.nextDouble();
        Circle c1=new Circle(r1);
        System.out.print("Creating circle 2, input radius: ");
        double r2=in.nextDouble();
        Circle c2=new Circle(r2);
        System.out.println("-------------------");
        System.out.println("The max circle's radius is "+(Circle)(Circle.max(c1,c2)).getRadius());
        System.out.println("===================");
        System.out.print("Creating rectangle 1, input width and height: ");
        double w1=in.nextDouble();
        double h1=in.nextDouble();
        Rectangle red1=new Rectangle(w1,h1);
        System.out.print("Creating rectangle 2, input width and height: ");
        double w2=in.nextDouble();
        double h2=in.nextDouble();
        Rectangle rec2=new Rectangle(w2,h2);
        System.out.println("-------------------");
        System.out.println("The max rectangle's width and height are "+Rectangle.max(red1,rec2).getWidth()+", "+Rectangle.max(red1,rec2).getHeight());
        System.out.println("===================");
    }
}