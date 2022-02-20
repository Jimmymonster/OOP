public class Tax {
    private double[] rates;
    private int[][] brackets={
        {8350, 33950, 82250, 171550, 372950},
        {16700, 67900, 137050, 20885, 372950},
        {8350, 33950, 68525, 104425, 186475},
        {11950, 45500, 117450, 190200, 372950}
    };
    private double taxableIncome;
    private int fillingstatus;
    //constructor
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
    //getter
    public double[] getrates()      {return rates;}
    public int[][] getbrackets()    {return brackets;}
    public double gettaxableIncome(){return taxableIncome;}
    public int getfillingstatus()   {return fillingstatus;}
    //setter
    public void setrates(double[] rates)                {this.rates=rates;}
    public void setbrackets(int[][] brackets)           {this.brackets=brackets;}
    public void settaxableIncome(double taxableIncome)  {this.taxableIncome=taxableIncome;}
    public void setfillingstatus(int fillingstatus)     {this.fillingstatus=fillingstatus;}
    //function
    private double computeTax(int[][] brackets,double[] rates,int status,double income){
        double tax = 0, incomeTaxed = 0;
		for (int i = 4; i >= 0; i--) {
			if (income > brackets[status][i])
 				tax += (incomeTaxed = income - brackets[status][i]) * rates[i + 1];
				income -= incomeTaxed;
		} 
		return tax += income * rates[0];
    }
    public double getTax(){
        return computeTax(brackets, rates, fillingstatus, taxableIncome);
    }
}
