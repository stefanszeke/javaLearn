import java.util.Arrays;

// Enumerations are a special type of class that represents a group of constants (unchangeable variables, like final variables).
// To create an enumeration, use the enum keyword (instead of class or interface), and separate the constants with a comma.
// Note that they should be in uppercase letters:

// To access an enum constant, use the enum name followed by a dot, and the constant name:

// The values() method returns an array of all enum constants in the same order as they are declared:




public class Enum1 {

    // enum declaration
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        // enum array, values() method returns an array of all enum constants in the same order as they are declared
        Level[] myArray = Level.values();

        // valueOf() method returns the enum constant of the specified string value, if any
        Level myVar2 = Level.valueOf("HIGH");

        System.out.println(myVar);
        System.out.println(myVar2);

        System.out.println();

        for (Level level : myArray) {
            System.out.println(level);
        }
        for (Level level: Level.values()) {
            System.out.println(level);
        }
        
        System.out.println();
        System.out.println(Arrays.toString(myArray));
        
        
        System.out.println();
        if(myVar == Level.MEDIUM) {
            System.out.println("if: Medium level");
        }
        else {
            System.out.println("if: Not medium level");
        }
        
        System.out.println();
        switch (myVar) {
            case LOW:
                System.out.println("switch: Low level");
                break;
            case MEDIUM:
                System.out.println("switch: Medium level");
                break;
            case HIGH:
                System.out.println("switch: High level");
                break;
            default:
                System.out.println("switch: Default");
                break;
        }
    }
}


