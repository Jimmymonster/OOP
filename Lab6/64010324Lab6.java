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
        int status;
        while(true){
            System.out.println("Filling Status");
            System.out.println("    [0]-Single filer");
            System.out.println("    [1]-Married jointly or qualifying widow(er)");
            System.out.println("    [2]-Married separately");
            System.out.println("    [3]-Head of household");
            System.out.print("Enter filing status ");
            status=in.nextInt();
            if(status<0||status>3)
                System.out.println("Invalid filing status");
            else
                break;
        }
        System.out.print("Enter taxable income ");
        double taxableIncome=in.nextDouble();
        System.out.println("Tax is "+computeTax(brackets, rates, status, taxableIncome));
    }
    public static double computeTax(int[][] brackets,double[] rates,int status,double income){
        double tax = 0, incomeTaxed = 0;
		for (int i = 4; i >= 0; i--) {
			if (income > brackets[status][i])
 				tax += (incomeTaxed = income - brackets[status][i]) * rates[i + 1];
				income -= incomeTaxed;
		} 
		return tax += income * rates[0];
    }
}
