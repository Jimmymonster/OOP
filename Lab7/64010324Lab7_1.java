class Pro1{
    public static void main(String args[]){
        Account1 a1 = new Account1(1,100);
        Saving s1 = new Saving(2,200);
        Checking c1 = new Checking(3,300,-1000);
        a1.setAnnualInterestRate(1.5);
        s1.setAnnualInterestRate(1.5);
        c1.setAnnualInterestRate(1.5);

        a1.withdraw(100);
        s1.withdraw(100);
        c1.withdraw(100);

        a1.deposit(3000);
        s1.deposit(3000);
        c1.deposit(3000);

        System.out.println(a1);
        System.out.println();
        System.out.println(s1);
        System.out.println();
        System.out.println(c1);
    }
}