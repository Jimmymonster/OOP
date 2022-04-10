import java.io.*;
import java.util.Scanner;
class pro3{
    public static void main(String args[])throws FileNotFoundException{
        File file = new File("D:/KMITL/Year1 2nd/OOP/Lab10/Pro2/Salary.txt");
        Scanner in = new Scanner(file);
        double totalAssistant=0,totalAssociate=0,totalFull=0;
        double totalAssistantSalary=0,totalAssociateSalary=0,totalFullSalary=0;
        while(in.hasNext()){
            String line=in.nextLine();
            String[] temp = line.split(" ");
            if(temp[2].equals("assistant")){
                totalAssistant++;
                totalAssistantSalary += Double.parseDouble(temp[3]);
            }
            else if(temp[2].equals("associate")){
                totalAssociate++;
                totalAssociateSalary += Double.parseDouble(temp[3]);
            }
            else{
                totalFull++;
                totalFullSalary += Double.parseDouble(temp[3]);
            }
        }
        in.close();
        System.out.printf("Total salary for assistant professor is %.2f\n" , totalAssistantSalary);
        System.out.printf("Total salary for associate professor is %.2f\n" , totalAssociateSalary);
        System.out.printf("Total salary for full professor is %.2f\n" , totalFullSalary);
        System.out.printf("Total salary for all professors is %.2f\n" , (totalAssistantSalary + totalAssociateSalary + totalFullSalary));
        System.out.println("------------------------------------------------");
        System.out.printf("Average salary for assistant professor is %.2f\n" , (totalAssistantSalary/totalAssistant));
        System.out.printf("Average salary for associate professor is %.2f\n" , (totalAssociateSalary/totalAssociate));
        System.out.printf("Average salary for full professor is %.2f\n" , (totalFullSalary/totalFull));
        System.out.printf("Average salary for all professors is %.2f\n" , ((totalAssistantSalary + totalAssociateSalary + totalFullSalary)/(totalAssistant + totalAssociate + totalFull)));
    }
}