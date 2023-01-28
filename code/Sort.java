import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        String[] strArr = {"bsd B","dsdas D", "chdgs A", "ascar C"};

        Arrays.sort(strArr, (a,b) -> a.split(" ")[1].compareTo(b.split(" ")[1]));

        for (String string : strArr) {System.out.println(string);}
        
        //
        System.out.println();

        String[] strArr2 = {"bsd B","dsdas D", "chdgs A", "ascar C"};
        
        Arrays.sort(strArr2, (a,b) -> a.replaceAll(".+ ", "").compareTo(b.replaceAll(".+ ", "")));
        
        for (String string : strArr2) {System.out.println(string);}
    }
}