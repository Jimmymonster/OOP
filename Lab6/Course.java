public class Course {
    private String courseName;
    private String[] students=new String[1];
    private int numberOfStudents=0;
    //constructor
    public Course(String courseName) {
        this.courseName = courseName;
    }
    //getter
    public String getCourseName() {return courseName;}
    public String[] getStudents() {return students;}
    public int getNumberOfStudents() {return numberOfStudents;}
    //setter
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
        int index=0;
        for(int i=0;i<numberOfStudents;i++) {
            if(students[i].equals(student)) {
                index=i;
                break;
            }
        }
        if(index==numberOfStudents) {
            System.out.println("Student not found.");
        }
        else{
            dropStudent(index);
        }
    }
    public void dropStudent(int index){
        String[] temp=new String[students.length-1];
        for(int i=0,k=0;i<students.length;i++,k++) {
            if(i==index) {
                i++;
            }
            temp[k]=students[i];
        }
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
