import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StaticClass {
    int userid;
    String fullName;
    static String collegeName = "Bits Pilani";
    static String collegeCity = "Punjab";

    //constructors

    public StaticClass(int userid, String fullName) {
        this.userid = userid;
        this.fullName = fullName;
    }

    void display() {
        System.out.println("User Id : " + userid + ", " + "Full Name : " +fullName + ", "+collegeName +", " +collegeCity);
    }

    @Getter
    @Setter
    public static class StaticClass1 extends StaticClass {
        static String collegeCity = "Delhi";

        public StaticClass1(int userid, String fullName) {
            super(userid, fullName);
        }

        void cityCheck() {
            System.out.println(StaticClass1.collegeCity);
        }
    }

    public static class TestStaticVariable1 {
        public static void main(String[] args) {
            StaticClass s1 = new StaticClass(111,"Karan");
            StaticClass s2 = new StaticClass(222,"Aryan");

            StaticClass1 s3 = new StaticClass1(2112, "Marian");
            //we can change the college of all objects by the single line of code  
            //Student.college="BBDIT";
            s1.display();
            s2.display();
            s3.display();

            s3.cityCheck();
        }
    }
}
