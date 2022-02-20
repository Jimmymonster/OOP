import java.util.*;
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
