class Pro2{
    public static void main(String args[]){
        GeometricObject[] squares = {new Square(4), new Square(5, "red", true), new Square(6, "blue", false)};
        for(int i=0;i<squares.length;i++){
            System.out.println("Square Number "+i);
            System.out.println(squares[i]);
            System.out.println("How to color: "+((Square)squares[i]).howToColor());
            ;
            System.out.println();
        }
    }
}