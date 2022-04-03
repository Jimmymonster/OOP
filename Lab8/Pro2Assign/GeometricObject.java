public abstract class GeometricObject implements Comparable<GeometricObject>{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;
    //constructor
    public GeometricObject(){
        dateCreated=new java.util.Date();
    }
    public GeometricObject(String color,boolean filled){
        dateCreated=new java.util.Date();
        this.color=color;
        this.filled=filled;
    }
    //accessor
    public String getColor()    {return color;}
    public boolean isFilled()   {return filled;}
    public java.util.Date getDateCreated() {return dateCreated;}
    //mutator
    public void setColor(String color) {this.color=color;}
    public void setFilled(boolean filled) {this.filled=filled;}
    //method
    public abstract int compareTo(GeometricObject o);
    public static GeometricObject max(GeometricObject o1, GeometricObject o2){
        if(o1.compareTo(o2)==1) return o1;
        else return o2;
    }
    public String toString(){
        return 
        "Area: "+getArea()+
        "\nPerimeter: "+getPerimeter()+
        "\ncolor: "+color+
        "\nfilled: "+filled;
        
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
