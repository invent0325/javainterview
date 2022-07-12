public class Student18 implements Cloneable{
    int rollno;
    String name;
    String location;
    String city;

    public Student18(int rollno, String name, String location, String city) {
        this.rollno = rollno;
        this.name = name;
        this.location = location;
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student18 s1=new Student18(101,"amit", "Bangalore", "BTM");
            Student18 s2 = (Student18) s1.clone();
            Student18 s3 = (Student18) s2.clone();

            System.out.println(s1.rollno+" "+s1.name +" " +s1.location +" "+s1.city);
            System.out.println(s1.rollno+" "+s1.name +" " +s1.location +" "+s1.city);
            System.out.println(s1.rollno+" "+s1.name +" " +s1.location +" "+s1.city);
        } catch (CloneNotSupportedException ignored) {

        }
    }
}
