import java.util.*;
class Pro1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        double weight=0,feet,inches,height;
        System.out.print("Enter your name: ");
        name=in.nextLine();
        System.out.print("Enter your age: ");
        age=in.nextInt();
        int opr;
        BMI bmi=new BMI(name,age,0,0);
        System.out.print("Weight (input format: 1=kg 2=pound value) :");
        while(true){
        opr=in.nextInt();
            weight=in.nextDouble();
            if(opr==1&&weight>0){
                break;
            }
            else if(opr==2&&weight>0){
                weight=weight*0.45359237;
                break;
            }
            else System.out.println("Invalid input");
        }
        System.out.print("Height (input format: 1=meter 2=feet-inch value) :");
        opr=in.nextInt();
        while(true){
            if(opr==1){
                height=in.nextDouble();
                if(height<0) System.out.println("Invalid input");
                else {
                    bmi=new BMI(name,age,weight,height);
                    break;
                }
            }
            else if(opr==2){
                feet=in.nextDouble();
                inches=in.nextDouble();
                if(feet<0||inches<0) System.out.println("Invalid input");
                else {
                    bmi=new BMI(name,age,weight,feet,inches);
                    break;
                }
            }
            else System.out.println("Invalid input");
        }
        System.out.println(bmi.getName() +"'s BMI is "+Math.round(bmi.getBMI()*100)/100.0);
        System.out.println(bmi.getName() +" status is "+bmi.getStatus());
    }
}
