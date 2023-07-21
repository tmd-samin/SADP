// Book.java
abstract class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

// Novel.java
class Novel extends Book {
    public Novel(String title) {
        super(title);
    }
}

// PoetryBook.java
class PoetryBook extends Book {
    public PoetryBook(String title) {
        super(title);
    }
}

// BookPrinter.java
class BookPrinter {
    public void printBookName(Book book) {
        System.out.println("Book Name: " + book.getTitle());
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Book novel = new Novel("The Merchant of Venice");
        Book poetryBook = new PoetryBook("Leaves of Grass");

        BookPrinter bookPrinter = new BookPrinter();
        bookPrinter.printBookName(novel);
        bookPrinter.printBookName(poetryBook);
    }
}
