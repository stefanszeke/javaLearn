package studentBuilder;

import java.util.Arrays;

public class StudentBuilder {
    private static String[] classes = {"1A", "1B", "1C", "2A", "2B", "2C", "3A", "3B", "3C"};

    public static Student makeStudent(String name, int age, String classOf) {
            return new Student(name, age, classOf);
    }

    public static boolean isValid(String name, int age, String classOf) {
        if(name.length() < 1) {System.out.println("Error: Name too short"); return false;}
        if(name.length() > 16) {System.out.println("Error: Name too long"); return false;}
        if(age < 14) {System.out.println("Error: Age too young"); return false;}
        if(age > 18) {System.out.println("Error: Age too old"); return false;}
        if(!Arrays.asList(classes).contains(classOf)) {System.out.println("Error: Wrong class"); return false;}
        return true;
    }

}