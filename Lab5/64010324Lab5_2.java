class Pro2{
    public static void main(String args[]){
        RegularPolygon po[]=new RegularPolygon[3];
        po[0]= new RegularPolygon();
        po[1]= new RegularPolygon(6,4);
        po[2]= new RegularPolygon(6,4,5.6,7.8);
        for(int i=0;i<3;i++)
            System.out.println(po[i]);
    }
}