import java.util.Scanner;
class Pro1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Triangle t;
        System.out.print("Input 3 sides of the triangle: ");
        int[] sides={in.nextInt(),in.nextInt(),in.nextInt()};
        System.out.print("The color is: ");
        String temp=in.nextLine();
        String color=in.nextLine();
        while(true){
            System.out.print("The triangle is filled(y/n): ");
            String c=in.nextLine();
            if(c.compareTo("y")==0){
                t=new Triangle(sides[0],sides[1],sides[2],color,true);
                break;
            }
            else if(c.compareTo("n")==0){
                t=new Triangle(sides[0],sides[1],sides[2],color,false);
                break;
            }
            else System.out.println("Must input y or n.");
        }
        System.out.println("---------------------------------------");
        System.out.println(t);
    }
}