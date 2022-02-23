import java.util.Date;
class Faculty extends Employee{
    private String office_hours;
    private String rank;
    Faculty(String name,String address,String phone_number,String email_address,String office,double salary,Date date_hired,String office_hours,String rank){
        super(name,address,phone_number,email_address,office,salary,date_hired);
        this.office_hours = office_hours;
        this.rank = rank;
    }
    //accessors
    public String getOffice_hours(){return office_hours;}
    public String getRank(){return rank;}
    //mutators
    public void setOffice_hours(String office_hours){this.office_hours = office_hours;}
    public void setRank(String rank){this.rank = rank;}
    //functions
    public String toString(){
        return "Faculty\n" + super.toString(1) + " Faculty{office_hours=" + office_hours + ", rank=" + rank + "}";
    }
}