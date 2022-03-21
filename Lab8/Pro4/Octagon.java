public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon>{
    private double side;
    public Octagon(){
        super();
    }
    public Octagon(double side){
        super();
        this.side = side;
    }
    public Octagon(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }
    //accessor
    public double getSide(){
        return side;
    }
    //mutator
    public void setSide(double side){
        this.side = side;
    }
    //method
    public double getArea(){
        return (2 + 4/Math.sqrt(2)) * side * side;
    }
    public double getPerimeter(){
        return 8 * side;
    }
    //method
    public int compareTo(Octagon o){
        if(getArea()>o.getArea()) return 1;
        else if(getArea()<o.getArea()) return -1;
        else return 0;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public String toString(){
        return super.toString() + "\nSide: " + side + 
        "\nArea: " + getArea() + 
        "\nPerimeter: " + getPerimeter();
    }
}