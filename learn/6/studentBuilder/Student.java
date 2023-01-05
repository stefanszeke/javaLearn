package studentBuilder;
import java.util.Arrays;

public class Student {
    private String name;
    private int age;
    private String classOf;

    public Student() {
        System.out.println();
        System.out.println("* Creating new student:");
        this.name = "nullName";
        this.age = 0;
        this.classOf = null;
        System.out.println("* created: " + this.toString());
        System.out.println();
        
    }
    public Student(String name, int age, String classOf) {
        System.out.println();
        System.out.println("* Creating new student:");
        setName(name);
        setAge(age);
        setClassOf(classOf);
        System.out.println("* created: " + this.toString());
        System.out.println();
    }

    public Student setName(String name) {
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
    public Student setAge(int age) {
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
    public Student setClassOf(String classOf) {
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