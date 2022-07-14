package nestedclass;

public class OuterClass {
    static int staticField = 0;
    int instanceField;

    public OuterClass() {
        instanceField = 1;
        System.out.println("Hello from OuterClass Constructor");
    }
}
