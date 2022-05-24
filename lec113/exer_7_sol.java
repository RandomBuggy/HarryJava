import java.util.ArrayList;

class Book {
    public String name, author;
    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

class Library {
    public ArrayList<Book> books;
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    public void addBook(Book book) {
        System.out.println("This book has been added to this library");
        this.books.add(book);
    }
    public void issueBook(Book book, String issued_to) {
        System.out.println("This book has been issued from this library " + issued_to);
        this.books.remove(book);
    }
    public void returnBook(Book book) {
        System.out.println("This book has been returned from this library");
    }
}

public class exer_7_sol {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<> ();
        bk.add(new Book("Algorithms", "CLRS"));
        Library l = new Library(bk);
        l.addBook(new Book("random", "demo"));
        System.out.println("Succeded");
    }
}

