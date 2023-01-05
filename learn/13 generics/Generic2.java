public class Generic2 {
    public static void main(String[] args) {
        Gen2<Integer, String> iOb = new Gen2<>(88, "Generics Test");
        iOb.showType();
        System.out.println("value: " + iOb.getMyObject());
        System.out.println("value: " + iOb.getMyObject2());

    }
}

class Gen2<T, V> {
    private T myObject;
    private V myObject2;

    public Gen2(T myObject, V myObject2) {
        this.myObject = myObject;
        this.myObject2 = myObject2;
    }

    public T getMyObject() {
        return myObject;
    }

    public void setMyObject(T myObject) {
        this.myObject = myObject;
    }

    public V getMyObject2() {
        return myObject2;
    }

    public void setMyObject2(V myObject2) {
        this.myObject2 = myObject2;
    }

    public void showType() {
        System.out.println("Type of T is: " + myObject.getClass().getName().replaceAll("java.lang.", ""));
        System.out.println("Type of V is: " + myObject2.getClass().getName().replaceAll("java.lang.", ""));
    }

}