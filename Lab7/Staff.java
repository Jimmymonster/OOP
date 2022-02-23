import java.util.Date;
class Staff extends Employee{
    private String title;
    Staff(String name,String address,String phone_number,String email_address,String office,double salary,Date date_hired,String title){
        super(name,address,phone_number,email_address,office,salary,date_hired);
        this.title = title;
    }
    //accessors
    public String getTitle(){return title;}
    //mutators
    public void setTitle(String title){this.title = title;}
    //functions
    public String toString(){
        return "Staff\n" + super.toString(1) + " Staff{title=" + title + "}";
    }
}
