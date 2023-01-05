
public class DefaultDemo {
    public static void main(String args[]) {

        MyIF obj1 = new MyClass1();
        MyIF obj2 = new MyClass2();
        
        System.out.println("User ID is " + obj1.getUserID());
        System.out.println("Admin ID is " + obj1.getAdminID());
        System.out.println("User ID is " + obj2.getUserID());
        System.out.println("Admin ID is " + obj2.getAdminID());
        System.out.println("universal ID is " + MyIF.getUniversalID());
    }

    static class MyClass1 implements MyIF {
        public int getUserID() {
            return 100;
        }
    }
    
    static class MyClass2 implements MyIF {
        public int getUserID() {
            return 200;
        }
        public int getAdminID() {
            return 300;
        }
    }
    
}




interface MyIF {
    int getUserID();
    default int getAdminID() { return 1; }
    static int getUniversalID() { return 0; }
}
