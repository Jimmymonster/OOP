import java.util.*;
class Person{
    private String name;
    private String address;
    private String phone_number;
    private String email_address;
    //constructor
    Person(String name, String address, String phone_number, String email_address){
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
        this.email_address = email_address;
    }
    //accessors
    public String getName()         {return name;}
    public String getAddress()      {return address;}
    public String getPhone_number() {return phone_number;}
    public String getEmail_address(){return email_address;}
    //mutators
    public void setName(String name)         {this.name = name;}
    public void setAddress(String address)   {this.address = address;}
    public void setPhone_number(String phone_number) {this.phone_number = phone_number;}
    public void setEmail_address(String email_address){this.email_address=email_address;}
    //functions
    public String toString(){
        return "Name: " + name + "\nAddress: " + address + "\nPhone Number: " + phone_number + "\nEmail Address: " + email_address;
    }
}
class Student extends Person{
    final class status{
        static final int FRESHMAN = 0;
        static final int SOPHOMORE = 1;
        static final int JUNIOR = 2;
        static final int SENIOR = 3;
    }
    Student(String name, String address, String phone_number, String email_address, int status){
        super(name, address, phone_number, email_address);
        //this.status = status;
    }
}
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
}
class Faculty extends Employee{
    private String office_hours;
    private String rank;
    Faculty(String name,String address,String phone_number,String email_address,String office,double salary,Date date_hired,String office_hours,String rank){
        super(name,address,phone_number,email_address,office,salary,date_hired);
        this.office_hours = office_hours;
        this.rank = rank;
    }
}
class Staff extends Employee{
    private String title;
    Staff(String name,String address,String phone_number,String email_address,String office,double salary,Date date_hired,String title){
        super(name,address,phone_number,email_address,office,salary,date_hired);
        this.title = title;
    }
}
class Pro3 {
    public static void main(String args[]){

    }
}
