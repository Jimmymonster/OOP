import java.util.*;
class Pro3{
    public static void main(String args[]){
        String s0="",s1="",s2="",temp="";
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the first city: "); s0=in.nextLine();
        System.out.print("Enter the second city: "); s1=in.nextLine();
        System.out.print("Enter the third city: "); s2=in.nextLine();
        if(s0.compareTo(s1)>0){
            temp=s0;
            s0=s1;
            s1=temp;
        }
        if(s0.compareTo(s2)>0){
            temp=s0;
            s0=s2;
            s2=temp;
        }
        if(s1.compareTo(s2)>0){
            temp=s1;
            s1=s2;
            s2=temp;
        }
        System.out.println("The three cities in alphabetical order are "+s0+" "+s1+" "+s2);
    }
}