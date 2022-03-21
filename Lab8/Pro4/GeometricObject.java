public abstract class GeometricObject{
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
    public String toString(){
        return "created on "+dateCreated+
        "\ncolor: "+color+
        "\nfilled: "+filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
