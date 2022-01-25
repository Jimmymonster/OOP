import java.util.*;
class BMI{
    private String name;
    private int age;
    private double weight,feet,inches;
    private double bmi;
    BMI(String name,int age,double weight,double feet,double inches){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.feet=feet;
        this.inches=inches;
        bmi=weight*0.45359237/(inches*inches*0.0254*0.0254);
    }
    public double getBMI(){
        return bmi;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getWeight(){
        return weight;
    }
    public double getFeet(){
        return feet;
    }
    public String getStatus(){
        if(bmi<18.5) return "Underweight";
        else if(bmi>=18.5 && bmi<=24.9) return "Normal";
        else if(bmi>=25 && bmi<=29.9) return "Overweight";
        else return "Obese";
    }
}
class Pro1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        double weight,feet,inches;
        System.out.print("Enter your name: ");
        name=in.nextLine();
        System.out.print("Enter your age: ");
        age=in.nextInt();
        System.out.print("Enter your weight: ");
        weight=in.nextDouble();
        System.out.print("Enter your height(feet): ");
        feet=in.nextDouble();
        System.out.print("Enter your height(inches): ");
        inches=in.nextDouble();
        BMI bmi=new BMI(name,age,weight,feet,inches);
        System.out.println(bmi.getName() +"'s BMI is "+bmi.getBMI());
        System.out.println(bmi.getName() +" status is "+bmi.getStatus());
    }
}
