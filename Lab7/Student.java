class Student extends Person{
    private int status;
    public final static int FRESHMAN = 1;
    public final static int SOPHOMORE = 2;
    public final static int JUNIOR = 3;
    public final static int SENIOR = 4;
    Student(String name, String address, String phone_number, String email_address, int status){
        super(name, address, phone_number, email_address);
        this.status = status;
        if(status < 1 || status > 4){
            System.out.println("Invalid status");
            System.exit(0);
        }
    }
    public void setStatus(int status){this.status = status;}
    public String getStatus(){
        if(status==1) return "freshman";
        else if(status==2) return "sophomore";
        else if(status==3) return "junior";
        else if(status==4) return "senior";
        else return "unknown";
    }
    public String toString(){
        return "Student\n" + super.toString() + " Student{status=" + getStatus() + "}";
    }
}
