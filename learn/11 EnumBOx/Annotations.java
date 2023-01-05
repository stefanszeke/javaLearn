// annotations are used to provide meta data to the compiler
// annotations are not part of the program, they are used by the compiler
// example: @Override, @Deprecated, @SuppressWarnings, @SafeVarargs, @FunctionalInterface

// 



public class Annotations {
    public static void main(String[] args) {
        
    }
}

// example of @Deprecated annotation:
// this annotation is used to indicate that a class, method, or field is deprecated
// deprecated means that it is no longer recommended to use it
// the compiler will generate a warning when a deprecated class, method, or field is used

@Deprecated
class Deprecated {
    public static void main(String[] args) {
        System.out.println("This is a deprecated class");
    }


    public void deprecatedMethod() {
        System.out.println("This is a deprecated method");
    }

    public void newMethod() {
        System.out.println("This is a new method");
    }
}


