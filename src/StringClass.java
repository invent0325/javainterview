import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringClass {
    public static void main(String[] args) throws ParseException {
        // These two have the same value
        System.out.println(new String("test") == "test");// --> true
    }
}
