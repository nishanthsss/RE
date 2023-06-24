import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGEX {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abc@yahoo.com");
        Matcher matcher = pattern.matcher("abc@yahoo.com");
        boolean b1 = matcher.matches();
        Pattern pattern1 = Pattern.compile("abc-100@yahoo.com");
        Matcher matcher1 = pattern1.matcher("abc-100yahoo.com");
        boolean b2 = matcher1.matches();
        Pattern pattern2 = Pattern.compile("abc@1.com");
        Matcher matcher2 = pattern2.matcher("abc@1.com");
        boolean b3 = matcher2.matches();
        Pattern pattern3 = Pattern.compile("abc111@abc.com");
        Matcher matcher3 = pattern.matcher("abc111@abc");
        boolean b4 = matcher.matches();
        Pattern pattern4 = Pattern.compile("abc@gmail.com.com");
        Matcher matcher4 = pattern.matcher("abc@gmail.com.com");
        boolean b5 = matcher.matches();
        Pattern pattern6 = Pattern.compile("abc+100@gmail.com");
        Matcher matcher6 = pattern.matcher("abc+100yahoo.com");
        boolean b7 = matcher.matches();
        System.out.println(b1+" "+b2+" "+b3+" "+b4+" "+b5+" "+b7);
    }}
