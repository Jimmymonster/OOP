public class Circle extends GeometricObject{
    private double radius;
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
    public int compareTo(Circle o){
        if(this.getRadius()>o.getRadius()) return 1;
        else if(this.getRadius()<o.getRadius()) return -1;
        else return 0;
    }
    public String toString(){
        return "Circle: radius="+radius+"\n" + super.toString();
    }
}
