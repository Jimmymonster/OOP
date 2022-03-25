public class Person{
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
        for(int i=0;i<phone_number.length();i++){
            if((phone_number.charAt(i)<'0'||phone_number.charAt(i)>'9')&&phone_number.charAt(i)!='-'&&phone_number.charAt(i)!=' '){
                System.out.println("Invalid phone number");
                System.exit(0);
            }
        }
    }
    //accessors
    public String getName()         {return name;}
    public String getAddress()      {return address;}
    public String getPhone_number() {return phone_number;}
    public String getEmail_address(){return email_address;}
    //mutators
    public void setName(String name)         {this.name = name;}
    public void setAddress(String address)   {this.address = address;}
    public void setPhone_number(String phone_number) {
        for(int i=0;i<phone_number.length();i++){
            if((phone_number.charAt(i)<'0'||phone_number.charAt(i)>'9')&&phone_number.charAt(i)!='-'&&phone_number.charAt(i)!=' '){
                System.out.println("Invalid phone number");
                return;
            }
        }
        this.phone_number = phone_number;
    }
    public void setEmail_address(String email_address){this.email_address=email_address;}
    //functions
    public String toString(){
        return "Name: " + name + 
        "\nAddress: " + address + 
        "\nPhone Number: " + phone_number + 
        "\nEmail Address: " + email_address +
        "\nPerson{name=" + name + ", address=" + address + ", phone_number=" + phone_number + ", email_address=" + email_address + "}";
    }
}


