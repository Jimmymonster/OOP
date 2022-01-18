import java.util.*;
class stock{
    String symbol,name;
    double proviousClosingPrice,currentPrice;
    stock(String symbol,String name){
        this.symbol=symbol;
        this.name=name;
    }
    double getChangePercent(){
        return (currentPrice-proviousClosingPrice)/proviousClosingPrice*100;
    }
}
class main{
    public static void main(String args[]){
        stock s = new stock("ORCL","Oracle Corporation");
        s.proviousClosingPrice=34.5;
        s.currentPrice=34.35;
        System.out.println("Symbol: "+s.symbol);
        System.out.println("Name: "+s.name);
        System.out.println("Previous Closing Price: "+s.proviousClosingPrice);
        System.out.println("Current Price: "+s.currentPrice);
        System.out.println("Price Change: "+s.getChangePercent()+"%");
    }
}