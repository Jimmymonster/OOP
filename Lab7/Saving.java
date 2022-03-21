

class Saving extends Account1{
    //constructors
    public Saving(){
        super();
    }
    public Saving(int id,double balance){
        super(id, balance);
        if(balance<0){
            System.out.println("Invalid balance");
            System.exit(0);
        }
    }
    //functions
    public void withdraw(double amount){
        if(amount<0){
            System.out.println("Invalid amount");
        }
        else if(getBalance()<amount){
            System.out.println("Insufficient funds");
        }
        else{
            super.withdraw(amount);
        }
    }
    public String toString(){
        return "Saving Account\n" + super.toString();
    }
}