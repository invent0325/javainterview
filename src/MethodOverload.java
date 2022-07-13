public class MethodOverload {
    public static void main(String[] args) {
        MethodOverload.sayHi();
        InnerClass.sayHi();
        InnerofInnerClass.sayHi();
    }

    private static void sayHi() {
        System.out.println("hello from MethodOverload Class");
    }

    public static class InnerClass {
        private static void sayHi() {
            System.out.println("hello from InnerClass Class");
        }
    }

    public static class InnerofInnerClass {
        private static void sayHi() {
            System.out.println("hello from Inner of Inner Class");
        }
    }
}
