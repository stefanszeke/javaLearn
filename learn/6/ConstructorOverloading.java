import java.util.Arrays;

public class ConstructorOverloading {
    public static void main(String[] args) {

        Student newStudent = new Student();
        newStudent.setName("Steve").setAge(17).setClassOf("1A");

        Student newStudent2 = new Student("Jo", 20, "5A");

        var newStudent3 = new Student().setName("Peter").setAge(17).setClassOf("4A");

        
        newStudent2.setAge(15);
        
        System.out.println();
        
        System.out.println(newStudent.toString());
        System.out.println(newStudent2.toString());
        System.out.println(newStudent3.toString());

        System.out.println();

    }


}

class Student {
    private String name;
    private int age;
    private String classOf;

    Student() {
        System.out.println();
        System.out.println("* Creating new student:");
        this.name = "nullName";
        this.age = 0;
        this.classOf = null;
        System.out.println("* created: " + this.toString());
        System.out.println();
        
    }
    Student(String name, int age, String classOf) {
        System.out.println();
        System.out.println("* Creating new student:");
        setName(name);
        setAge(age);
        setClassOf(classOf);
        System.out.println("* created: " + this.toString());
        System.out.println();
    }

    Student setName(String name) {
        System.out.println("Setting name for: " + this.name + " to: " + name);
        if(name.length() > 16) {
            System.out.println("!nameError: " + name + " is too long");
            return this;
        }
        if(name.length() < 3) {
            System.out.println("!nameError: " + name + " is too short");
            return this;
        }
        this.name = name;
        return this;
    }
    Student setAge(int age) {
        System.out.println("Setting age for: " + this.name + " to: " + age);
        if(age < 12) {
            System.out.println("!ageError: " + age + " is too young");
            return this;
        }
        if(age > 17) {
            System.out.println("!ageError: " + age + " is too old");
            return this;
        }
        this.age = age;
        return this;
    }
    Student setClassOf(String classOf) {
        System.out.println("Setting class for: " + this.name + " to: " + classOf);
        String[] classes = {"1A", "1B", "1C", "2A", "2B", "2C", "3A", "3B", "3C"};
        if(Arrays.asList(classes).contains(classOf)) {
            this.classOf = classOf;
        } else {
            System.out.println("!classOfError: " + classOf + " is not a valid class");
        }
        return this;
    }

    public String toString() {
        return "[Name: " + this.name + " | Age: " + this.age + " | Class: " + this.classOf + " | valid?: " + this.isValid() +"]";
    }

    public boolean isValid() {
        return this.name != null && this.age != 0 && this.classOf != null;
    }
}