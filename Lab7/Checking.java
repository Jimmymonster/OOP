class Checking extends Account1{
    private double overdraft_limit=0;
    //constructors
    public Checking(){
        super();
    }
    public Checking(int id,double balance,double overdraft_limit){
        super(id,balance);
        this.overdraft_limit = overdraft_limit;
        if(overdraft_limit>0){
            System.out.println("Overdraft limit must be negative");
            System.exit(0);
        }
        if(balance<overdraft_limit){
            System.out.println("Invalid balance");
            System.exit(0);
        }
    }
    //accessors
    public double getoverdraft_limit(){return overdraft_limit;}
    //mutators
    public void setoverdraft_limit(double overdraft_limit){
        if(overdraft_limit>0){
            System.out.println("Overdraft limit must be negative");
            return ;
        }
        this.overdraft_limit = overdraft_limit;
    }
    //functions
    public void withdraw(double amount){
        if (amount<0){
            System.out.println("Invalid amount");
        }
        if(getBalance()<amount+overdraft_limit){
            System.out.println("Insufficient funds");
        }
        else{
            super.withdraw(amount);
        }
    }
    public String toString(){
        return "Checking Account\n" + super.toString() + "\nOverdraft Limit: " + (-1*overdraft_limit);
    }
}
