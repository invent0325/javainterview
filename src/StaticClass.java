import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StaticClass {
    static int userid;
    static String fullName;
    static String collegeName = "Bits Pilani";
    static String collegeCity = "Punjab";

    //constructors

    public StaticClass(int userid, String fullName) {
        StaticClass.userid = userid;
        StaticClass.fullName = fullName;
    }

    static void display() {
        System.out.println("User Id : " + userid + ", " + "Full Name : " +fullName + ", "+collegeName +", " +collegeCity);
    }

    @Getter
    @Setter
    public static class StaticClass1 extends StaticClass {
        static String collegeCity = "Delhi";

        public StaticClass1(int userid, String fullName) {
            super(userid, fullName);
        }

        static void cityCheck() {
            System.out.println(StaticClass1.collegeCity);
        }
    }

    public static class TestStaticVariable1 {
        public static void main(String[] args) {
            new StaticClass(111,"Karan");
            new StaticClass(222,"Aryan");

            new StaticClass1(2112, "Marian");
            //we can change the college of all objects by the single line of code  
            //Student.college="BBDIT";
            StaticClass.display();
            StaticClass.display();
            StaticClass1.display();

            StaticClass1.cityCheck();
        }
    }
}
