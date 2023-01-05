import java.util.Arrays;
import java.util.regex.*;
import java.util.stream.*;

public class RegexNotes {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber1(numbers));

        String strToCompare = "abcde";
        String ending = "cde";
        System.out.println(compareEndings(strToCompare, ending));

        String url = "https://www.google.com/";
        String url2 = "https://www.google.com/?q=hello";
        String url3 = "http://google.com/asda/asdasd";
        String url4 = "google.com/asda/asdasd";
        String url5 = "google.com";
        System.out.println("url regex: " + urlRegex(url));
        System.out.println("url regex: " + urlRegex(url2));
        System.out.println("url regex: " + urlRegex(url3));
        System.out.println("url regex: " + urlRegex(url4));
        System.out.println("url regex: " + urlRegex(url5));
    }

    // regex grouping
    public static String createPhoneNumber(int[] numbers) {
        String numberStr = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining());

        Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{4})");
        Matcher matcher = pattern.matcher(numberStr);
        
        if(!matcher.matches()) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        return "(" + matcher.group(1) + ") " + matcher.group(2) + "-" + matcher.group(3);
    }

    // regex grouping with replace
    public static String createPhoneNumber1(int[] numbers) {
        String numberStr = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining());

        Pattern pattern = Pattern.compile("(\\d{3})(\\d{3})(\\d{4})");
        Matcher matcher = pattern.matcher(numberStr);
        
        if(!matcher.matches()) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        return matcher.replaceAll("($1) $2-$3");
    }

    // replace groups
    public static String createPhoneNumber2(int[] numbers) {
        String pattern = "(###) ###-####";
        for(int i : numbers) {
            pattern = pattern.replaceFirst("#", Integer.toString(i));
        }
        return pattern;
    }

    // compare endings
    public static boolean compareEndings(String str, String ending) {
        Pattern pattern = Pattern.compile("(.+)(.{" + ending.length() + "}$)");
        Matcher matcher = pattern.matcher(str);

        if(!matcher.find()) { return false ; }

        String strEnding = matcher.group(2);
        return strEnding.equals(ending);
    }  

    // ulr regex
    public static String urlRegex(String url) {
        Pattern pattern = Pattern.compile("(.+\\/\\/)?(www)?\\.?(.+)\\.(\\w+)(.+)?");
        Matcher matcher = pattern.matcher(url);
        return matcher.replaceAll("1:[$1] www?:[$2] name:[$3] top:[$4] rest:[$5]");
    }

    // while loop regex
    public static String cleanString2(String s) {
        while(s.matches(".*#.*")) { // "#" is not enough, needs to match the whole string, everything before and after the #.
        s = s.replaceFirst(".?#", ""); // replace first # and if "?" there is a character "." before the "#" replace that also
        }
        return s;
    }
}
