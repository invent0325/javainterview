package nestedclass;

public class ClassTester {
    public static void main(String[] args) {
        System.out.println(OuterClass.staticField);

        OuterClass outerClass = new OuterClass();
        System.out.println(outerClass.instanceField);
    }
}
