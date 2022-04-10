import java.io.*;
class pro2{
    public static void main(String args[]) throws FileNotFoundException{
        File file = new File("Salary.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }
        String rank[] = {"assistant","associate","full"};
        double salary;
        PrintWriter output = new PrintWriter(file);
        for(int i=1;i<=1000;i++){
            output.print("FirstName" + i + " LastName" + i);
            String temp = rank[(int)(Math.random()*3)];
            if(temp.equals("assistant")){
                salary = (double)(Math.random()*30001) + 50000;
            }
            else if(temp.equals("associate")){
                salary = (double)(Math.random()*50001) + 60000;
            }
            else{
                salary = (double)(Math.random()*55001) + 75000;
            }
            output.printf(" %s %.2f\n" ,temp ,salary);
        }
        output.close();
    }
}