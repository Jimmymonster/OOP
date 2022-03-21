import java.util.*;
class Pro3 {
    public static void main(String args[]){
        Person p = new Person("Jim","AJ-Park B13","123-456-7890","dont tell");
        System.out.println(p+"\n");
        Student s = new Student("Jim","AJ-Park B13","123-456-7890","dont tell",Student.FRESHMAN);
        System.out.println(s+"\n");
        Employee e = new Employee("Jim","AJ-Park B13","123-456-7890","dont tell","CE-KMITL",30000,new Date());
        System.out.println(e+"\n");
        Faculty f = new Faculty("Jim","AJ-Park B13","123-456-7890","dont tell","CE-KMITL",30000,new Date(),"8:00-12:00","Just Regular Person");
        System.out.println(f+"\n");
        Staff st = new Staff("Jim","AJ-Park B13","123-456-7890","dont tell","CE-KMITL",30000,new Date(),"Just Regular Person");
        System.out.println(st+"\n");
    }
}
