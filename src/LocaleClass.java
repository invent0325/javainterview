import java.util.Locale;

public class LocaleClass {
    public static void main(String[] args) {

        Locale geek1 = new Locale("English", "IN");
        System.out.println(geek1.getDisplayCountry());
        System.out.println(geek1.getDisplayLanguage());
    }
}
