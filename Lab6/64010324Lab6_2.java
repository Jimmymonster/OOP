import java.util.*;
class Pro2{
    public static void main(String args[]){
        Course javaprogramming= new Course("JAVA Programming");
        javaprogramming.addStudent("John");
        javaprogramming.addStudent("Mary");
        javaprogramming.addStudent("Peter");
        javaprogramming.addStudent("James");

        javaprogramming.dropStudent("John");
        javaprogramming.dropStudent("Not a student");

        System.out.println(javaprogramming);
    }
}
