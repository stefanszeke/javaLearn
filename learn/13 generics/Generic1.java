public class Generic1 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        iOb.showType();
        System.out.println("value: " + iOb.getMyObject());
        System.out.println();

        Gen<String> strOb = new Gen<String>("Generics Test");
        strOb.showType();
        System.out.println("value: " + strOb.getMyObject());

    }


}

class Gen<T> {
    private T myObject;

    public Gen(T myObject) {
        this.myObject = myObject;
    }

    public T getMyObject() {
        return myObject;
    }

    public void setMyObject(T myObject) {
        this.myObject = myObject;
    }

    public void showType() {
        System.out.println("Type of T is: " + myObject.getClass().getName().replaceAll("java.lang.", ""));
    }

    public void checker() {
        System.out.print("Is myObject an Integer? ");
        if (myObject instanceof Integer) { System.out.println("true"); } else { System.out.println("false"); }
        System.out.print("Is myObject a String? ");
        if (myObject instanceof String) { System.out.println("true"); } else { System.out.println("false"); }
    }
}