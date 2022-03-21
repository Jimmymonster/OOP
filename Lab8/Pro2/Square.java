public class Square extends GeometricObject implements Colorable{
    private double side;
    public Square(){
        super();
    }
    public Square(double side){
        super();
        this.side=side;
    }
    public Square(double side,String color,boolean filled){
        super(color,filled);
        this.side=side;
    }
    //accessor
    public double getSize(){return side;}
    //mutator
    public void setSize(double side){this.side=side;}
    //method
    public double getArea(){return side*side;}
    public double getPerimeter(){return 4*side;}
    public String howToColor(){
        return "Color all four sides.";
    }
    public String toString(){
        return super.toString()+"\nSide "+side +"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter();
    }
}
