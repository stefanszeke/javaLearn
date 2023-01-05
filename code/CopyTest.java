import java.util.Arrays;

public class CopyTest {
    public static void main(String[] args) {
        char[] oldArr = {1,2};
        char[] newArr = new char[4];
        char[] newArr2 = Arrays.copyOf(oldArr, 4);

        System.out.println("oldArr length: " + oldArr.length + " " + Arrays.toString(oldArr) );
        System.out.println("newArr length: " + newArr.length + " " + Arrays.toString(newArr) );
        System.out.println("newArr2 length: " + newArr2.length + " " + Arrays.toString(newArr2) );
        
        
        System.out.println("after copy:");
        System.arraycopy(oldArr, 0, newArr, 0, 2);

        System.out.println("oldArr length: " + oldArr.length + " " + Arrays.toString(oldArr) );
        System.out.println("newArr length: " + newArr.length + " " + Arrays.toString(newArr) );
    }
}