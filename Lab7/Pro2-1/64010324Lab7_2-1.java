import java.util.Scanner;
class Pro2{
    public static void main(String args[]){
        Triangle t = new Triangle(10,15,20);
        t.setColor("RED"); t.setFilled(true);
        Circle c= new Circle(10);
        c.setColor("BLUE"); c.setFilled(false);
        Rectangle r= new Rectangle(10,20);
        r.setColor("GREEN"); r.setFilled(true);
        displayObject(t);
        displayObject(c);
        displayObject(r);
    }
    public static void displayObject(GeometricObject obj){
        if(obj instanceof Circle){
            System.out.println("-Circle-");
            System.out.println("Radius: "+((Circle)obj).getRadius());
            System.out.println("Area: "+((Circle)obj).getArea());
            System.out.println("Perimeter: "+((Circle)obj).getPerimeter());
            System.out.println("Color: "+((Circle)obj).getColor());
            System.out.println("Filled: "+((Circle)obj).isFilled());
            System.out.println("===========================");
        }
        else if(obj instanceof Rectangle){
            System.out.println("-Rectangle-");
            System.out.println("Width: "+((Rectangle)obj).getWidth());
            System.out.println("Height: "+((Rectangle)obj).getHeight());
            System.out.println("Area: "+((Rectangle)obj).getArea());
            System.out.println("Perimeter: "+((Rectangle)obj).getPerimeter());
            System.out.println("Color: "+((Rectangle)obj).getColor());
            System.out.println("Filled: "+((Rectangle)obj).isFilled());
            System.out.println("===========================");
        }
        else if(obj instanceof Triangle){
            System.out.println("-Triangle-");
            System.out.println("Side1: "+((Triangle)obj).getSide1());
            System.out.println("Side2: "+((Triangle)obj).getSide2());
            System.out.println("Side3: "+((Triangle)obj).getSide3());
            System.out.println("Area: "+((Triangle)obj).getArea());
            System.out.println("Perimeter: "+((Triangle)obj).getPerimeter());
            System.out.println("Color: "+((Triangle)obj).getColor());
            System.out.println("Filled: "+((Triangle)obj).isFilled());
            System.out.println("===========================");
        }
    }
}
