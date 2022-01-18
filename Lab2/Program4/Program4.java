import java.util.*;
class main{
    public static void main(String args[]){
        String[] s=new String[3];
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the first city: "); s[0]=in.nextLine();
        System.out.print("Enter the second city: "); s[1]=in.nextLine();
        System.out.print("Enter the third city: "); s[2]=in.nextLine();
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                if(s[i].compareTo(s[j])>0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println("The three cities in alphabetical order are "+s[0]+" "+s[1]+" "+s[2]);
    }
}