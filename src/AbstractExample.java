public class AbstractExample {
    public static void main(String[] args) {
        System.out.println("hello world");

        Books.getBooks();

    }

    public abstract static class Books {
        static void getBooks() {
        }

        abstract void sellBooks();
        abstract void readBooks();
    }

    public class BookDetailsClass extends Books {

        static void getBooks() {
            System.out.println("getting books");
        }

        @Override
        void sellBooks() {
            System.out.println("selling books");
        }

        @Override
        void readBooks() {
            System.out.println("reading books");
        }
    }

}
