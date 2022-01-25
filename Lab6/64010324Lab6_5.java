import java.util.*;
class Tax{
    private double[] rates;
    private int[][] brackets={
        {8350, 33950, 82250, 171550, 372950},
        {16700, 67900, 137050, 20885, 372950},
        {8350, 33950, 68525, 104425, 186475},
        {11950, 45500, 117450, 190200, 372950}
    };
    private double taxableIncome;
    private int fillingstatus;
    public Tax(){
        this.fillingstatus=0;
        this.rates=new double[]{0.10,0.15,0.25,0.28,0.33,0.36};
        this.taxableIncome=400000;
    }
    public Tax(int fillingstatus,double[] rates,int[][] brackets,double taxableIncome){
        this.fillingstatus=fillingstatus;
        this.rates=rates;
        this.brackets=brackets;
        this.taxableIncome=taxableIncome;
    }
    public double getTax(){
        double tax=0;
        for(int i=brackets[fillingstatus].length-1;i>=0;i--){
            if(taxableIncome>=brackets[fillingstatus][i]){
                tax+=(taxableIncome-brackets[fillingstatus][i])*rates[i+1];
                taxableIncome=brackets[fillingstatus][i];
            }
        }
        if(taxableIncome>0){
            tax+=(taxableIncome-0)*rates[0];
        }
        return tax;
    }
}
class Pro5{
    public static void main(String args[]){
        Tax tax=new Tax();
        System.out.println("Tax is "+tax.getTax());
    }
}
