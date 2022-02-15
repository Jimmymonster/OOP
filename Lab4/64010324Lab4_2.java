import java.util.*;
class Pro2{
    public static void main(String args[]){
        Calendar cal = new GregorianCalendar();
        System.out.println("Current year, month, date, and day of the week");
        System.out.println("Year is " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + (cal.get(GregorianCalendar.MONTH)+1));
        System.out.println("Date is " + cal.get(GregorianCalendar.DATE));
        System.out.println("Day of the week is " + cal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        cal.setTimeInMillis(cal.getTime().getTime() + 86400000);
        System.out.println("Year is " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + (cal.get(GregorianCalendar.MONTH)+1));
        System.out.println("Date is " + cal.get(GregorianCalendar.DATE));
        System.out.println("Day of the week is " + cal.get(GregorianCalendar.DAY_OF_WEEK));
        System.out.println(cal.getTime());
    }
}