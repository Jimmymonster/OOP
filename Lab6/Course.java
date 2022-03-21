public class Course {
    private String courseName;
    private String[] students=new String[1];
    private int numberOfStudents=0;
    //constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }
    //accessor
    public String getCourseName() {return courseName;}
    public String[] getStudents() {return students;}
    public int getNumberOfStudents() {return numberOfStudents;}
    //mutator
    public void setCourseName(String courseName) {this.courseName = courseName;}
    //function
    public void addStudent(String student) {
        if(numberOfStudents==students.length) {
            String[] temp=new String[students.length+1];
            for(int i=0;i<students.length;i++) {
                temp[i]=students[i];
            }
            students=temp;
        }
        students[numberOfStudents]=student;
        numberOfStudents++;
    }
    public void dropStudent(String student){
        boolean ch=false;
        int index=0;
        for(int i=0;i<numberOfStudents;i++) {
            if(students[i].equals(student)) {
                index=i;
                ch=true;
                break;
            }
        }
        if(!ch) {
            System.out.println("Student not found.");
        }
        else{
            dropStudent(index);
        }
    }
    public void dropStudent(int index){
        if(index>numberOfStudents){
            System.out.println("Out of range.");
            return;
        }
        String[] temp=new String[students.length-1];
        for(int i=0,k=0;i<students.length;i++,k++) {
            if(i==index) {
                i++;
            }
            temp[k]=students[i];
        }
        students[--numberOfStudents]=null;
        students=temp;
    }
    public void clear(){
        students=new String[1];
        numberOfStudents=0;
    }
    public String toString(){
        if(numberOfStudents>0){
            String temp="";
            for(int i=0;i<numberOfStudents;i++) {
                temp+=students[i]+"\n";
            }
            return "Course name: "+courseName+"\n"+"Students in the course. \n"+temp;
        }
        else{
            return "Course name: "+courseName+"\n"+"No students in the course.";
        }
    }
}
