import java.util.*;
class Pro4{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        double[] rates={0.10,0.15,0.25,0.28,0.33,0.36};
        int[][] brackets={
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}
        };
        System.out.println("Filling Status");
        System.out.println("    [0]-Single filer");
        System.out.println("    [1]-Married jointly or qualifying widow(er)");
        System.out.println("    [2]-Married separately");
        System.out.println("    [3]-Head of household");
        System.out.print("Enter filing status ");
        int status=in.nextInt();
        System.out.print("Enter taxable income ");
        double taxableIncome=in.nextDouble();
        double tax=0;
        for(int i=4;i>=0;i--){
            if(taxableIncome>=brackets[status][i]){
                tax+=(taxableIncome-brackets[status][i])*rates[i+1];
                taxableIncome=brackets[status][i];
            }
        }
        if(taxableIncome>0){
            tax+=(taxableIncome-0)*rates[0];
        }
        System.out.println("Tax is "+tax);
    }
}
