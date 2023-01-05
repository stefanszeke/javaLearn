public class InheritTest {

    public static void main(String[] args) {
        ClassA classA = new ClassA();
        var myObject = classA.makeObj(10);

        System.out.println(myObject.getClass().getName());
    }
    
}

class ClassA {
    int a = 1;

    ClassA makeObj(int a) {
        if(a == 0) return new ClassA();
        return new ClassB(a);
    }
}

class ClassB extends ClassA {
    int b = 2;
    int x;
    ClassB(int x) {
        this.x = x;
    }
}