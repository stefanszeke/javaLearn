import studentBuilder.Student;
import studentBuilder.StudentBuilder;

class App {
    public static void main(String args[]) {
        System.out.println("working");
        Student newStudent = new Student();
        newStudent.setName("Steve").setAge(17).setClassOf("1A").toString();

        
        if(StudentBuilder.isValid("John", 17, "2B")) {
            Student newStudent2 = StudentBuilder.makeStudent("John", 17, "2B");
            newStudent2.toString();
        } else System.out.println("not valid!");
        
    }


}
