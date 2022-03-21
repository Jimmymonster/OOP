class Pro4{
    public static void main(String args[]) throws CloneNotSupportedException{
        Octagon o1 = new Octagon(5);
        System.out.println(o1);
        System.out.println("Cloning...");
        Octagon o2 = (Octagon)o1.clone();
        if(o1.compareTo(o2)==0) System.out.println("o1 and o2 are equal");
        else if(o1.compareTo(o2)==1) System.out.println("o1 is greater than o2");
        else System.out.println("o1 is less than o2");
    }
}