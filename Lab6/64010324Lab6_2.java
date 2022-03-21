class Pro2{
    public static void main(String args[]){
        Course j= new Course("JAVA Programming");
        j.addStudent("student");
        j.addStudent("student2");
        j.addStudent("student3");
        j.addStudent("student4");
        j.clear();
        j.dropStudent("studentadasdsad");
        
        System.out.println(j);
    }
}
