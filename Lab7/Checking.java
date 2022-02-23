class Checking extends Account1{
    private double overdraft_limit=0;
    //constructors
    public Checking(){
        super();
    }
    public Checking(int id,double balance,double overdraft_limit){
        super(id,balance);
        this.overdraft_limit = overdraft_limit;
    }
    //accessors
    public double getoverdraft_limit(){return overdraft_limit;}
    //mutators
    public void setoverdraft_limit(double overdraft_limit){this.overdraft_limit = overdraft_limit;}
    //functions
    public void withdraw(double amount){
        if(getBalance()<amount+overdraft_limit){
            System.out.println("Insufficient funds");
        }
        else{
            setBalance(getBalance()-amount);
        }
    }
    public String toString(){
        return super.toString() + "\nOverdraft Limit: " + overdraft_limit;
    }
}
