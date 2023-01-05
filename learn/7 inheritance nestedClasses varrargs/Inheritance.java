

class Inheritance {
    public static void main(String[] args) {
        // Person person1 = new Person("John", 30); // cant do this because Person is abstract
        Student student1 = new Student("Jack", 21, "Computer Science");
        System.out.println();
        CoolerStudent coolerStudent1 = new CoolerStudent("Jill", 20, "Computer Science", "Java");

        System.out.println();

        student1.show();
        student1.introduce();
        coolerStudent1.show();
        coolerStudent1.show("wee");

        System.out.println();
        
        student1.introduce();
        coolerStudent1.introduce();
        
        System.out.println();

        People.compareAge(student1, coolerStudent1);
        People.showSubclassForAll(student1, coolerStudent1);
    }
}

abstract class Person {
    final private String name;
    private int age;
    
    Person(String name, int age) {
        System.out.println("Person constructor called");
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println(" -> name: " + name + ", age: " + age);
    }

    String getName() { return name; }
    // void setName(String name) { this.name = name; } // cant do this because name is final

    abstract void introduce();
    
    int getAge() { return age; }
    void setAge(int age) { this.age = age; }
}

class Student extends Person {
    String major;
    
    Student(String name, int age, String major) {
        super(name, age);
        System.out.println("Student constructor called");
        this.major = major;
    }

    void show() {
        super.show();
        System.out.println("\tmajor: " + major);
    }

    final void introduce() { // needs to be implemented because Person.introduce() is abstract
        System.out.println("Hello, my name is " + getName() + " and I'm " + getAge() + " years old.");
    }
}

final class CoolerStudent extends Student { // final class cannot be extended

    String specialty;

    CoolerStudent(String name, int age, String major, String specialty) {
        super(name, age, major);
        System.out.println("CoolerStudent constructor called");
        this.specialty = specialty;
    }

    void show() {
        super.show();
        System.out.println("\tspecialty: " + specialty);
    }

    void show(String message) {
        System.out.println("Different signature of show(): " + message);
    }

    // void introduce() { // cant do this because introduce() is final in Student
    //     System.out.println("Hello, my name is " + getName() + " and I'm " + getAge() + " years old. I'm a " + major + " major and I specialize in " + specialty + ".");
    // }
}

class People {
    public static void compareAge(Person p1, Person p2) {
        if(p1.getAge() > p2.getAge()) {
            System.out.println(p1.getName() + ": ["+ p1.getAge() + "] is older than " + p2.getName()+ ": ["+ p2.getAge() + "]");
        } else if(p1.getAge() < p2.getAge()) {
            System.out.println(p1.getName()+ ": ["+ p1.getAge() + "] is younger than " + p2.getName()+ ": ["+ p2.getAge() + "]");
        } else {
            System.out.println(p1.getName() + " is the same age as " + p2.getName() + ": [" + p1.getAge() + "]");
        }
    }

    public static void showSubclassForAll(Person ... people) {
        for(int i = 0; i < people.length; i++) {
            String msg = people[i].getName() + " is a " + showSubclass(people[i]);
            if(i < people.length - 1) { System.out.print(msg + " | "); } 
            else { System.out.print(msg+ " "  + people[i].getClass()); } // object.getClass() returns the class of the object
        }
        System.out.println();
    }
    

    private static String showSubclass(Person p) {
        if(p instanceof CoolerStudent) {
            return "Cooler Student";
        } else if(p instanceof Student) {
            return "Student";
        } else {
            return "Person";
        } 
    }
}
