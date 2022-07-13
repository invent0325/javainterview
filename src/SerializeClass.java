import lombok.Getter;
import lombok.Setter;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;
import java.io.Serializable;

public class SerializeClass {
    public static void main(String[] args) throws Exception {
        Book book = new Book();
        book.setBookName("Java Reference");
        book.setDescription("will not be saved");
        book.setCopies(25);
        Book.serialize(book);
    }

    @Getter
    @Setter
    public static class Book implements Serializable {
        @Serial
        private static final long serialVersionUID = -2936687026040726549L;
        private String bookName;
        private transient String description;
        private transient int copies;

        // getters and setters
        public static void serialize(Book book) throws Exception {
            FileOutputStream file = new FileOutputStream("fileName.txt");
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(book);
            out.close();
            file.close();
        }
    }
}

