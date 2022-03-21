class Test{
    public static void main(String args[]){
        Product[] p=new Product[3];
        p[0]=new Product("A","A001");
        p[1]=new Product("B","B001",20,10,20);
        p[2]=new Product("C","C001",30,15,30);
        double profit=0;
        p[0].addQuantity(30);
        p[0].setBuyprice(100);
        p[0].setSellprice(1000);
        profit+=p[0].sellprofit(5)+p[1].sellprofit(10)+p[2].sellprofit(15);
        Product.setShop_open(false);
        profit+=p[0].sellprofit(5); //<-- can't sell because shop is closed
        System.out.println("Total profit: "+profit);
        for(int i=0;i<3;i++){
            System.out.println(p[i]);
        }
    }
}
