public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
    private double width;
    private double height;
    //constructor
    public Rectangle(){
        super();
    }
    public Rectangle(double width,double height){
        super();
        this.width=width;
        this.height=height;
    }
    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.height=height;
    }
    //accessor
    public double getWidth()    {return width;}
    public double getHeight()   {return height;}
    //mutator
    public void setWidth(double width) {this.width=width;}
    public void setHeight(double height) {this.height=height;}
    //method
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public int compareTo(Rectangle r){
        if(this.getArea()>r.getArea())
            return 1;
        else if(this.getArea()<r.getArea())
            return -1;
        else
            return 0;
    }
    public boolean equals(Object o){
        return this.compareTo((Rectangle)o)==0;
    }
    public String toString(){
        return super.toString() +
        "\nwidth: "+width+
        "\nheight: "+height+
        "\narea: "+getArea()+
        "\nperimeter: "+getPerimeter();
    }
}
