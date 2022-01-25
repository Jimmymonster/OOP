import java.util.*;
import java.math.*;
class RegularPolygon{
    private int n=3;
    private double side=1;
    private double x=0;
    private double y=0;
    public RegularPolygon(){
    }
    public RegularPolygon(int n,double side){
        this.n = n;
        this.side = side;
    }
    public RegularPolygon(int n,double side,double x,double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    public int getn()       {return n;}
    public double getside() {return side;}
    public double getx()    {return x;}
    public double gety()    {return y;}
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return n*side*side/4*Math.tan(Math.PI/n);
    }
}
class Pro2{
    public static void printpoly(RegularPolygon p){
        System.out.println("The number of sides is "+p.getn());
        System.out.println("The length of each side is "+p.getside());
        System.out.println("The x-coordinate is "+p.getx());
        System.out.println("The y-coordinate is "+p.gety());
        System.out.println("The perimeter is "+p.getPerimeter());
        System.out.println("The area is "+p.getArea());
    }
    public static void main(String args[]){
        RegularPolygon po0= new RegularPolygon();
        RegularPolygon po1= new RegularPolygon(6,4);
        RegularPolygon po2= new RegularPolygon(6,4,5.6,7.8);
        printpoly(po0);
        printpoly(po1);
        printpoly(po2);
    }
}