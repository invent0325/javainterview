package nestedclass;

public class ClassTester {
    public static void main(String[] args) {
        System.out.println(OuterClass.staticField);

        OuterClass outerClass = new OuterClass();
        OuterClass outerClass2 = new OuterClass();

        /*System.out.println(outerClass1.instanceField);

        OuterClass outerClass2 = new OuterClass();

        outerClass1.staticField++;
        System.out.println(outerClass1.staticField);

        outerClass2.staticField++;
        System.out.println(outerClass2.staticField);

        OuterClass.staticField++;
        System.out.println(outerClass1.staticField);*/

        outerClass.instanceField+= 2;
        System.out.println(outerClass.instanceField);

        outerClass2.instanceField+= 5;
        System.out.println(outerClass2.instanceField);

        System.out.println(outerClass.instanceField + " " + outerClass2.instanceField);

    }
}
