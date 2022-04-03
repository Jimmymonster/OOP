public class Circle extends GeometricObject{
    double radius;
    //constructor
    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
        if(radius<0){
            System.out.println("Error: radius cannot be negative");
            System.exit(0);
        }
    }
    //accessor
    public double getRadius(){return radius;}
    //mutator
    public void setRadius(double radius){this.radius=radius;}
    //method
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "radius="+radius+"\n" + super.toString();
    }
}
