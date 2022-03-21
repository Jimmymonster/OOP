public class BMI{
    private String name;
    private int age;
    private double weight;
    private double height;
    //constructor
    public BMI(String name,int age,double weight,double height){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.height=height;
    }
    public BMI(String name,double weight,double height){
        this(name,20,weight,height);
    }
    public BMI(String name,int age,double weight,double feet,double inches){
        this(name,age,weight,(inches+feet*12)*0.0254);
    }
    //accessor
    public String getName()     {return name;}
    public int getAge()         {return age;}
    public double getWeight()   {return weight;}
    public double getHeight()     {return height;}
    //mutator
    public void setName(String name)     {this.name=name;}
    public void setAge(int age)         {this.age=age;}
    public void setWeight(double weight)   {this.weight=weight;}
    public void setHeight(double height)    {this.height=height;}   
    //function
    public double getBMI(){
        return weight/(height*height);
    }
    public String getStatus(){
        double bmi=getBMI();
        if(bmi<18.5) return "Underweight";
        else if(bmi>=18.5 && bmi<=24.9) return "Normal";
        else if(bmi>=25 && bmi<=29.9) return "Overweight";
        else return "Obese";
    }
}