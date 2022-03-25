public class Rectangle extends GeometricObject{
    private double width;
    private double height;
    //constructor
    public Rectangle(){
    }
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
        if(width<0||height<0){
            System.out.println("Error: side length cannot be negative");
            System.exit(0);
        }
    }
    //accessor
    public double getWidth(){return width;}
    public double getHeight(){return height;}
    //mutator
    public void setWidth(double width){this.width=width;}
    public void setHeight(double height){this.height=height;}
    //method
    public double getArea(){
        return width*height;
    }
    public double getPerimeter(){
        return 2*(width+height);
    }
    public String toString(){
        return "Rectangle: width="+width+" height="+height+"\n" + super.toString();
    }
    
}
