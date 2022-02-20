public class RegularPolygon {
    //variables
    private int n=3;
    private double side=1;
    private double x=0;
    private double y=0;
    //constructor
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
    //accessor
    public int getn()       {return n;}
    public double getside() {return side;}
    public double getx()    {return x;}
    public double gety()    {return y;}
    //mutator
    public void setn(int n)       {this.n = n;}
    public void setside(double side) {this.side = side;}
    public void setx(double x)    {this.x = x;}
    public void sety(double y)    {this.y = y;}
    //function
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return n*side*side/4*Math.tan(Math.PI/n);
    }
    public String toString(){
        return "The number of sides is "+this.getn()+
        "\nThe length of each side is "+this.getside()+
        "\nThe x-coordinate is "+this.getx()+
        "\nThe y-coordinate is "+this.gety()+
        "\nThe perimeter is "+this.getPerimeter()+
        "\nThe area is "+this.getArea() + "\n";
    }
}
