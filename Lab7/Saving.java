class Saving extends Account1{
    //constructors
    public Saving(){
        super();
    }
    public Saving(int id,double balance){
        super(id, balance);
    }
    //functions
    public void withdraw(double amount){
        if(getBalance()<amount){
            System.out.println("Insufficient funds");
        }
        else{
            setBalance(getBalance()-amount);
        }
    }
}