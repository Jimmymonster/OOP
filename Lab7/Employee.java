import java.util.Date;
class Employee extends Person{
    private String office;
    private double salary;
    private Date date_hired;
    Employee(String name,String address,String phone_number,String email_address,String office,double salary,Date date_hired){
        super(name,address,phone_number,email_address);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }
    //accessors
    public String getOffice(){return office;}
    public double getSalary(){return salary;}
    public Date getDate_hired(){return date_hired;}
    //mutators
    public void setOffice(String office){this.office = office;}
    public void setSalary(double salary){this.salary = salary;}
    //functions
    public String toString(){
        return "Employee\n" + super.toString() + " Employee{office=" + office + ", salary=" + salary + ", date_hired=" + date_hired + "}";
    }
    public String toString(int forsubclass){
        return super.toString() + " Employee{office=" + office + ", salary=" + salary + ", date_hired=" + date_hired + "}";
    }
}
