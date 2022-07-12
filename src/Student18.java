public class Student18 implements Cloneable{
    int rollno;
    String name;
    String location;

    public Student18(int rollno, String name, String location) {
        this.rollno = rollno;
        this.name = name;
        this.location = location;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student18 s1=new Student18(101,"amit", "Bangalore");
            Student18 s2 = (Student18) s1.clone();
            Student18 s3 = (Student18) s2.clone();

            System.out.println(s1.rollno+" "+s1.name +" " +s1.location);
            System.out.println(s2.rollno+" "+s2.name +" " +s2.location);
            System.out.println(s3.rollno+" "+s3.name +" " +s3.location);
        } catch (CloneNotSupportedException ignored) {

        }
    }
}
