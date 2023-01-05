public class GenericBound {
    public static void main(String[] args) {
        NumbericFns<Integer> iOb = new NumbericFns<>(6);
        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
        System.out.println("Fractional component of iOb is " + iOb.fraction());
        System.out.println();
        
        NumbericFns<Double> dOb = new NumbericFns<>(-6.0);
        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("Fractional component of dOb is " + dOb.fraction());
        System.out.println();
        
        if (iOb.absEqual(dOb)) {
            System.out.println("Absolute values are equal.");
        } else {
            System.out.println("Absolute values differ.");
        }
    }
}


class NumbericFns<T extends Number> {
    T num;
    
    NumbericFns(T num) {
        this.num = num;
    }
    
    double reciprocal() {
        return 1 / num.doubleValue();
    }
    
    double fraction() {
        return num.doubleValue() - num.intValue();
    }
    
    boolean absEqual(NumbericFns<?> ob) {
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return true;
        }
        return false;
    }
}

class SameType<T, V extends T> {
    T ob1;
    V ob2;
    
    SameType(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    
    boolean isSame() {
        if (ob1 == ob2) {
            return true;
        }
        return false;
    }
}

// <T, V extends T> means that V must be of type T or a subclass of T
// <? extends T> means that the type of the object is unknown, but it is known to be a subclass of T