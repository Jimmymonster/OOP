public class Triangle extends GeometricObject{
    private double[] side= new double[3];
    public Triangle(){
    }
    public Triangle(double side1,double side2,double side3){
        side[0]=side1;
        side[1]=side2;
        side[2]=side3;
    }
    public Triangle(double side1,double side2,double side3,String color,boolean filled){
        this(side1,side2,side3);
        setColor(color);
        setFilled(filled);
    }
    //accessor
    public double getSide(int index){
        if(index<1||index>3){
            System.out.println("Invalid index");
            return -1;
        }
        return side[index-1];
    }
    //mutator
    public void setSide(int index,double side){
        if(index<1||index>3){
            System.out.println("Invalid index");
            return;
        }
        this.side[index-1]=side;
    }
    //method
    public double getArea(){
        double s=(side[0]+side[1]+side[2])/2;
        return Math.sqrt(s*(s-side[0])*(s-side[1])*(s-side[2]));
    }
    public double getPerimeter(){
        return side[0]+side[1]+side[2];
    }
}
