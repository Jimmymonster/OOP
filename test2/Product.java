import java.util.Date;
public class Product{
    private String name;
    private String code;
    private double sellprice=0;
    private double buyprice=0;
    private int quantity=0;
    private Date lastDate_edited;
    private static boolean shop_open=true;
    //constructor
    public Product(String name,String code){
        this.name=name;
        this.code=code;
        this.lastDate_edited=new Date();
    }
    public Product(String name,String code,double sellprice,double buyprice,int quantity){
        this.name=name;
        this.code=code;
        this.sellprice=sellprice;
        this.buyprice=buyprice;
        this.quantity=quantity;
        this.lastDate_edited=new Date();
    }
    //accessor
    public String getName(){return name;}
    public String getCode(){return code;}
    public double getSellprice(){return sellprice;}
    public double getBuyprice(){return buyprice;}
    public int getQuantity(){return quantity;}
    public Date getLastDate_edited(){return lastDate_edited;}
    public static boolean getShop_open(){return shop_open;}
    //mutator
    public void setName(String name){this.name=name;this.lastDate_edited=new Date();}
    public void setCode(String code){this.code=code;this.lastDate_edited=new Date();}
    public void setSellprice(double sellprice){
        if(sellprice<0){
            System.out.println("Sell price cannot be negative");
            return;
        }
        this.sellprice=sellprice;
        this.lastDate_edited=new Date();
    }
    public void setBuyprice(double buyprice){
        if(buyprice<0){
            System.out.println("Buy price cannot be negative");
            return;
        }
        this.buyprice=buyprice;
        this.lastDate_edited=new Date();
    }
    public static void setShop_open(boolean shop_open){
        Product.shop_open=shop_open;
    }
    //function
    public void addQuantity(int quantity){
        if(quantity<0){
            System.out.println("Quantity must be positive");
            return;
        }
        this.quantity+=quantity;
        this.lastDate_edited=new Date();
    }
    public double sellprofit(int quantity){
        if(getShop_open()==false){
            System.out.println("Shop is closed");
            return 0;
        }
        if(quantity<0){
            System.out.println("Quantity must be positive");
            return 0;
        }
        if(quantity>this.quantity){
            System.out.println("Not enough quantity");
            return 0;
        }
        this.quantity-=quantity;
        this.lastDate_edited=new Date();
        return quantity*(this.sellprice-this.buyprice);
    }
    public String toString(){
        return "Product Name: "+this.name+
        "\nCode: "+this.code+
        "\nSell price: "+this.sellprice+
        "\nBuy price: "+this.buyprice+
        "\nQuantity: "+this.quantity+
        "\nLast date edited: "+this.lastDate_edited;
    }
}