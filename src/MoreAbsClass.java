public class MoreAbsClass {
    public static void main(String[] args) {
        HelloExtends he = new HelloExtends();
        he.message();
        he.horn();
    }

    public abstract static class Hello {
        abstract void message();
        abstract void horn();
    }

    public static class HelloExtends extends Hello {
        void message() {
            System.out.println("message");
        }

        @Override
        void horn() {
            System.out.println("honking");
        }
    }
}
